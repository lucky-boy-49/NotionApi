package com.lucky.notionapi.model.block.type.heading;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.enumerate.Color;
import com.lucky.notionapi.model.block.AbstractBlock;
import com.lucky.notionapi.model.block.richtext.RichTextType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 标题抽象
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class HeadingBlock1 extends AbstractBlock {

    @JsonProperty("heading_1")
    private Heading1 heading1;

    public HeadingBlock1() {
        this.heading1 = new Heading1();
    }

    @Data
    static class Heading1 {

        /**
         * 标题的富文本。
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
         * 标题块是否是切换标题。如果 true ，则标题块会切换并可以支持子项。如果 false ，则标题块是静态标题块。
         */
        @JsonProperty("is_toggleable")
        private Boolean isToggleable;

    }

}
