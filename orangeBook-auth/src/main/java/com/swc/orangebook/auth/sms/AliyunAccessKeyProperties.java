package com.swc.orangebook.auth.sms;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author Wilson
 * @Description:
 * @date 2024/9/11 22:41
 */
@ConfigurationProperties(prefix = "aliyun")
@Component
@Data
@RefreshScope
public class AliyunAccessKeyProperties {
    private String accessKeyId;
    private String accessKeySecret;
}
