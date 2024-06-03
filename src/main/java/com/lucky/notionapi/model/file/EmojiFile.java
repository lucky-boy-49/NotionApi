package com.lucky.notionapi.model.file;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 表情符号对象包含有关表情符号字符的信息。它最常用于表示在 Notion UI 中呈现为页面图标的表情符号。
 * @author 贺佳
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmojiFile extends AbstractFile {

    /**
     * 表情符号字符。
     * 要使用 Notion API 将表情符号对象呈现为页面图标，请将页面的图标属性字段设置为表情符号对象。
     */
    private String emoji;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public EmojiFile(Boolean initType) {
        if (initType) {
            type = EMOJI;
        }
    }

}
