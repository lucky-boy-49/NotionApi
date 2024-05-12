package com.lucky.notionapi.model.icon;

import lombok.Data;

/**
 * @author 贺佳
 */
@Data
public abstract class AbstractIcon implements IconType {

    /**
     * 文件对象的类型。可能的类型值为： "external" 、 "file" 。
     *  表情对象类型的常量字符串 "emoji" 。
     */
    private String type;

}
