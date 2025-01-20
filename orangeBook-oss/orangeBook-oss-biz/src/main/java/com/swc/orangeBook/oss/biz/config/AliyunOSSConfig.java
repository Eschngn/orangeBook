package com.swc.orangeBook.oss.biz.config;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.common.auth.CredentialsProviderFactory;
import com.aliyun.oss.common.auth.DefaultCredentialProvider;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Wilson
 * @Description: 阿里云 Client 配置
 * @date 2024/9/16 14:19
 */
@Configuration
public class AliyunOSSConfig {
    @Resource
    private AliyunOSSProperties aliyunOSSProperties;

    @Bean
    public OSS aliyunOSSClient(){
        // 设置访问凭证
        DefaultCredentialProvider credentialsProvider = CredentialsProviderFactory.newDefaultCredentialProvider(
                aliyunOSSProperties.getAccessKey(), aliyunOSSProperties.getSecretKey());
        // 创建 OSSClient 实例
        return new OSSClientBuilder().build(aliyunOSSProperties.getEndpoint(), credentialsProvider);
    }
}
