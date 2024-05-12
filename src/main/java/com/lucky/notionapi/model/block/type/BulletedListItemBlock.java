package com.lucky.notionapi.model.block.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.enumerate.Color;
import com.lucky.notionapi.model.block.AbstractBlock;
import com.lucky.notionapi.model.block.BlockType;
import com.lucky.notionapi.model.block.richtext.RichTextType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 项目符号列表项
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BulletedListItemBlock extends AbstractBlock {

    /**
     * 富文本数组
     *
     * @see RichTextType
     */
    @JsonProperty("rich_text")
    private RichTextType[] richText;

    /**
     * 颜色
     *
     * @see Color
     */
    private String color;

    /**
     * 块的嵌套子块（如果有）。
     *
     * @see BlockType
     */
    private BlockType[] children;

}
