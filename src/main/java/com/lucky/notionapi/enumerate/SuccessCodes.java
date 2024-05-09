package com.lucky.notionapi.enumerate;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Notion 请求成功枚举
 * @author jiahe
 */
@Getter
@RequiredArgsConstructor
public enum SuccessCodes {

    /**
     * 200
     * Notion 成功处理了请求。
     */
    SUCCESS_CODES(200, "Notion 成功处理了请求。");

    /**
     * Http状态码
     */
    private final int statusCode;

    /**
     * 响应信息
     */
    private final String message;

}