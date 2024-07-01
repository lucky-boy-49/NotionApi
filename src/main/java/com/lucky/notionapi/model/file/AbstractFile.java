package com.lucky.notionapi.model.file;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.config.NotionConfig;
import com.lucky.notionapi.model.communal.richtext.RichTextType;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 抽象文件类类
 * @author 贺佳
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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

    /**
     * 文件块的标题。
     */
    @Valid
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Size(max = NotionConfig.BLOCK_ARRAY_SIZE, message = NotionConfig.BLOCK_ARRAY_MESSAGE)
    protected RichTextType[] caption;

}
