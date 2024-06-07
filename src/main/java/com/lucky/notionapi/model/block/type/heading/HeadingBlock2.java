package com.lucky.notionapi.model.block.type.heading;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.config.NotionConfig;
import com.lucky.notionapi.model.block.AbstractBlock;
import com.lucky.notionapi.model.communal.Color;
import com.lucky.notionapi.model.communal.richtext.RichTextType;
import com.lucky.notionapi.model.communal.richtext.type.TextRichText;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 标题抽象
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HeadingBlock2 extends AbstractBlock {

    @Valid
    @JsonProperty("heading_2")
    private Heading2 heading2;

    public HeadingBlock2() {
        type = HEADING_2;
    }

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Heading2 {

        /**
         * 标题的富文本。
         *
         * @see RichTextType
         */
        @Valid
        @JsonProperty("rich_text")
        @Size(max = NotionConfig.BLOCK_ARRAY_SIZE, message = NotionConfig.BLOCK_ARRAY_MESSAGE)
        private TextRichText[] richText;

        /**
         * 块的颜色
         *
         * @see Color
         */
        private String color;

        /**
         * 标题块是否是切换标题。如果 true ，则标题块会切换并可以支持子项。如果 false ，则标题块是静态标题块。
         */
        @JsonProperty("is_toggleable")
        private Boolean isToggleable;

    }

}
