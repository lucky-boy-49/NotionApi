package com.lucky.notionapi.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Notion配置，对一些参数进行限制
 * @author jiahe
 */
@Data
@ConfigurationProperties("notion.api")
public class NotionConfigProperties {

    /**
     * Notion请求地址。
     */
    private String baseUrl;

    /**
     * 当前NotionApi的版本。
     */
    private String version;

    /**
     * 认证token
     */
    private String token;

}