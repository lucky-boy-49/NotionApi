package com.lucky.notionapi.exception;

/**
 * 创建实体时的异常，字段校验异常等。
 *
 * @author jiahe
 */
public class CreateEntityException extends RuntimeException {


    public CreateEntityException(String message) {
        super(message);
    }

    public CreateEntityException(String message, Throwable cause) {
        super(message, cause);
    }

}
