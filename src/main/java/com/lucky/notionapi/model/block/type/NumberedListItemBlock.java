package com.lucky.notionapi.model.block.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.enumerate.Color;
import com.lucky.notionapi.model.block.AbstractBlock;
import com.lucky.notionapi.model.block.BlockType;
import com.lucky.notionapi.model.block.richtext.RichTextType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 编号列表项
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class NumberedListItemBlock extends AbstractBlock {

    @JsonProperty("numbered_list_item")
    private NumberedListItem numberedListItem;

    public NumberedListItemBlock() {
        numberedListItem = new NumberedListItem();
        type = NUMBERED_LIST_ITEM;
    }

    @Data
    static class NumberedListItem {

        /**
         * numbered_list_item 块中显示的富文本。
         *
         * @see RichTextType
         */
        @JsonProperty("rich_text")
        private RichTextType[] richText;

        /**
         * 块的颜色
         *
         * @see Color
         */
        private String color;

        /**
         * numbered_list_item 块的嵌套子块（如果有）。
         *
         * @see BlockType
         */
        private BlockType[] children;

    }

}
