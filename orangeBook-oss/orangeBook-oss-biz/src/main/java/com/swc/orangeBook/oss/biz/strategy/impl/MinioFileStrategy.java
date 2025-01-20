package com.swc.orangeBook.oss.biz.strategy.impl;

import com.swc.orangeBook.oss.biz.config.MinioProperties;
import com.swc.orangeBook.oss.biz.strategy.FileStrategy;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import jakarta.annotation.Resource;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

/**
 * @author Wilson
 * @Description: TODO
 * @date 2024/9/16 12:52
 */
@Slf4j
public class MinioFileStrategy implements FileStrategy {
    @Resource
    private MinioProperties minioProperties;
    @Resource
    private MinioClient minioClient;

    @Override
    @SneakyThrows
    public String uploadFile(MultipartFile file, String bucketName) {
        log.info("## 上传文件至 Minio ...");

        // 判断文件是否为空
        if(file==null||file.getSize()==0){
            log.error("==> 上传文件异常：文件大小为空 ...");
            throw new RuntimeException("文件大小不能为空");
        }
        // 文件的原始名称
        String originalFilename = file.getOriginalFilename();
        // 文件的 Content-Type
        String contentType = file.getContentType();

        // 生成存储对象的名称（将 UUID 字符串中的 - 替换成空字符串）
        String key = UUID.randomUUID().toString().replace("-", "");
        // 获取文件的后缀，如 .jpg
        String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));

        // 拼接上文件后缀，即为要存储的文件名
        String objectName = String.format("%s%s", key, suffix);
        log.info("==> 开始上传文件至 Minio, ObjectName: {}", objectName);

        // 上传文件至 Minio
        minioClient.putObject(PutObjectArgs.builder()
                        .bucket(bucketName)
                        .contentType(contentType)
                        .object(objectName)
                        .stream(file.getInputStream(), file.getSize(), -1)
                        .build());
        // 返回文件的访问链接
        String url = String.format("%s/%s/%s", minioProperties.getEndpoint(), bucketName, objectName);
        log.info("==> 上传文件至 Minio 成功，访问路径: {}", url);
        return url;
    }
}
