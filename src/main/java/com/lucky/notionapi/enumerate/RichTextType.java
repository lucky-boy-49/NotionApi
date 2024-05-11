package com.lucky.notionapi.enumerate;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 富文本类型对象枚举
 * @author jiahe
 */
@Getter
@RequiredArgsConstructor
public enum RichTextType {

    /**
     * 文本
     */
    TEXT("text"),
    /**
     * 提到
     */
    MENTION("mention"),
    /**
     * 方程
     */
    EQUATION("equation");

    private final String name;

}
