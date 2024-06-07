package com.lucky.notionapi.model.block.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.config.NotionConfig;
import com.lucky.notionapi.model.block.AbstractBlock;
import com.lucky.notionapi.model.communal.Color;
import com.lucky.notionapi.model.communal.richtext.RichTextType;
import com.lucky.notionapi.model.file.FileType;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
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

    @Valid
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
        @Size(max = NotionConfig.BLOCK_ARRAY_SIZE, message = NotionConfig.BLOCK_ARRAY_MESSAGE)
        private RichTextType[] richText;

        /**
         * 代表标注图标的表情符号或文件对象。如果标注没有图标。
         *
         * @see FileType
         */
        @Valid
        private FileType icon;

        /**
         * 颜色
         *
         * @see Color
         */
        private String color;
    }

}
