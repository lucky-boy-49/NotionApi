package com.lucky.notionapi.model.block.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.config.NotionConfig;
import com.lucky.notionapi.model.block.AbstractBlock;
import com.lucky.notionapi.model.block.BlockType;
import com.lucky.notionapi.model.communal.Color;
import com.lucky.notionapi.model.communal.richtext.RichTextType;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 切换块
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ToggleBlock extends AbstractBlock {

    @Valid
    private Toggle toggle;

    public ToggleBlock() {
        type = TOGGLE;
    }

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Toggle {

        /**
         * 显示在切换块中的富文本。
         */
        @JsonProperty("rich_text")
        @Size(max = NotionConfig.BLOCK_ARRAY_SIZE, message = NotionConfig.BLOCK_ARRAY_MESSAGE)
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
        @Size(max = NotionConfig.BLOCK_ARRAY_SIZE, message = NotionConfig.BLOCK_ARRAY_MESSAGE)
        private BlockType[] children;

    }

}
