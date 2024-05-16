package com.lucky.notionapi.dao;

import lombok.Data;

/**
 * 错误响应
 *
 * @author jiahe
 */
@Data
public class ErrorDao {

    private String object;

    private String status;

    private String code;

    private String message;

}
