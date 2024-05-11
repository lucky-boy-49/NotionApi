package com.lucky.notionapi.enumerate;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 提到对象枚举
 * @author jiahe
 */
@Getter
@RequiredArgsConstructor
public enum MentionType {

    /**
     * 数据库提及类型对象
     */
    DATABASE("database"),
    /**
     * 日期提及类型对象
     */
    DATE("date"),
    /**
     * 链接预览提及类型对象
     */
    LINK_PREVIEW("link_preview"),
    /**
     * 页面提及类型对象
     */
    PAGE("page"),
    /**
     * 模板提及类型对象
     */
    TEMPLATE_MENTION("template_mention"),
    /**
     * 用户提及类型对象
     */
    USER("user");


    private final String type;


}
