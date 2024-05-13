package com.lucky.notionapi.model.file;

import lombok.Data;

/**
 * @author 贺佳
 */
@Data
public abstract class AbstractFile implements FileType {

    /**
     * 文件对象的类型。可能的类型值为： "external" 、 "file" 。
     *  表情对象类型的常量字符串 "emoji" 。
     */
    private String type;

    /**
     * 作为页面属性时有该字段
     */
    private String name;

}
