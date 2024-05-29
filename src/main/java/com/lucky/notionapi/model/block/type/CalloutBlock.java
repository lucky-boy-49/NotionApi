package com.lucky.notionapi.model.block.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.enumerate.ColorEnum;
import com.lucky.notionapi.model.block.AbstractBlock;
import com.lucky.notionapi.model.block.richtext.RichTextType;
import com.lucky.notionapi.model.file.FileType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 标注
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CalloutBlock extends AbstractBlock {

    private Callout callout;

    public CalloutBlock() {
        type = CALLOUT;
    }

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Callout {
        /**
         * 富文本数组
         *
         * @see RichTextType
         */
        @JsonProperty("rich_text")
        private RichTextType[] richText;

        /**
         * 代表标注图标的表情符号或文件对象。如果标注没有图标。
         *
         * @see FileType
         */
        private FileType icon;

        /**
         * 颜色
         *
         * @see ColorEnum
         */
        private String color;
    }

}
