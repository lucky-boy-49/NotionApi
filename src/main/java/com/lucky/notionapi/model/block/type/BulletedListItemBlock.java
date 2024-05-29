package com.lucky.notionapi.model.block.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.enumerate.ColorEnum;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BulletedListItemBlock extends AbstractBlock {

    @JsonProperty("bulleted_list_item")
    private BulletedListItem bulletedListItem;

    public BulletedListItemBlock() {
        type = BULLETED_LIST_ITEM;
    }

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class BulletedListItem {

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
         * @see ColorEnum
         */
        private String color;

        /**
         * 块的嵌套子块（如果有）。
         *
         * @see BlockType
         */
        private BlockType[] children;
    }

}
