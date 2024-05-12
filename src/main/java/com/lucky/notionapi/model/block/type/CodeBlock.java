package com.lucky.notionapi.model.block.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.enumerate.CodeLanguage;
import com.lucky.notionapi.model.block.AbstractBlock;
import com.lucky.notionapi.model.block.richtext.RichTextType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 代码
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CodeBlock extends AbstractBlock {

    private Code code;

    @Data
    static class Code {

        /**
         * 代码块标题中的富文本。
         *
         * @see RichTextType
         */
        private RichTextType[] caption;

        /**
         * 代码块中的富文本。
         */
        @JsonProperty("rich_text")
        private RichTextType richText;

        /**
         * 代码块中包含的代码的语言。
         *
         * @see CodeLanguage
         */
        private String language;

    }

}
