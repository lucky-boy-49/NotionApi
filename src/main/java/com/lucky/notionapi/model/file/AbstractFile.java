package com.lucky.notionapi.model.file;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @author 贺佳
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class AbstractFile implements FileType {

    /**
     * 文件对象的类型。可能的类型值为： "external" 、 "file" 。
     *  表情对象类型的常量字符串 "emoji" 。
     */
    protected String type;

    /**
     * 作为页面属性时有该字段
     */
    protected String name;

}
