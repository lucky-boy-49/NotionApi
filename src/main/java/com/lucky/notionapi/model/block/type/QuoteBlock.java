package com.lucky.notionapi.model.block.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.config.NotionConfig;
import com.lucky.notionapi.enumerate.ColorEnum;
import com.lucky.notionapi.model.block.AbstractBlock;
import com.lucky.notionapi.model.block.BlockType;
import com.lucky.notionapi.model.communal.richtext.RichTextType;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuoteBlock extends AbstractBlock {

    @Valid
    private Quote quote;

    public QuoteBlock() {
        type = QUOTE;
    }

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Quote {

        /**
         * 报价块中显示的富文本。
         *
         * @see RichTextType
         */
        @JsonProperty("rich_text")
        @Size(max = NotionConfig.BLOCK_ARRAY_SIZE, message = NotionConfig.BLOCK_ARRAY_MESSAGE)
        private RichTextType[] richText;

        /**
         * 块的颜色。
         *
         * @see ColorEnum
         */
        private String color;

        /**
         * 引用块的嵌套子块（如果有）。
         *
         * @see BlockType
         */
        @Size(max = NotionConfig.BLOCK_ARRAY_SIZE, message = NotionConfig.BLOCK_ARRAY_MESSAGE)
        private BlockType[] children;

    }

}
