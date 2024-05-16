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
     * 富文本对象内容大小。
     */
    private int textContentSize;

    /**
     * 富文本对象链接地址大小。
     */
    private int textLinkUrlSize;

    /**
     * 富文本对象方程表达式大小。
     */
    private int equationExpressionSize;

    /**
     * 所有块类型的任何数组大小，包括富文本对象。
     */
    private int blockArraySize;

    /**
     * 任意网址大小
     */
    private int urlSize;

    /**
     * 任意电子邮件大小
     */
    private int emailSize;

    /**
     * 任意电话号码大小
     */
    private int phoneSize;

    /**
     * 任意多选选项大小
     */
    private int multiSelectSize;

    /**
     * 任意关系大小
     */
    private int relationSize;

    /**
     * 任意人员大小
     */
    private int peopleSize;

    private String token;

}