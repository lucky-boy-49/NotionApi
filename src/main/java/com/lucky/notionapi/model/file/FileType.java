package com.lucky.notionapi.model.file;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import static com.lucky.notionapi.model.file.FileType.*;

/**
 * 代表图标的表情符号或文件对象。
 * 页面、嵌入、图像、视频、文件、pdf 和书签块类型都包含文件对象。图标和封面页对象值还包含文件对象。
 * @author 贺佳
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, include = JsonTypeInfo.As.EXISTING_PROPERTY)
@JsonSubTypes({
        @Type(value = FileFile.class, name = FILE),
        @Type(value = EmojiFile.class, name = EMOJI),
        @Type(value = ExternalFile.class, name = EXTERNAL)
})
public interface FileType {

    /**
     * 文件
     */
    String FILE = "file";

    /**
     * 表情符号
     */
    String EMOJI = "emoji";

    /**
     * 外部文件
     */
    String EXTERNAL = "external";

}
