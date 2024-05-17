package com.lucky.notionapi.model.block.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.enumerate.Color;
import com.lucky.notionapi.model.block.AbstractBlock;
import com.lucky.notionapi.model.block.BlockType;
import com.lucky.notionapi.model.block.richtext.RichTextType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 切换块
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ToggleBlock extends AbstractBlock {

    private Toggle toggle;

    public ToggleBlock() {
        this.toggle = new Toggle();
    }

    @Data
    static class Toggle {

        /**
         * 显示在切换块中的富文本。
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
         * Toggle 块的嵌套子块（如果有）。
         */
        private BlockType[] children;

    }

}
