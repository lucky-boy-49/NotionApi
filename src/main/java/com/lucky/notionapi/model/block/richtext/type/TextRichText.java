package com.lucky.notionapi.model.block.richtext.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.model.block.richtext.AbstractRichText;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 如果富文本对象的 type 值为 "text"
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TextRichText extends AbstractRichText {

    private Text text;

    public TextRichText() {
        type = TEXT;
    }

    @Data
    static class Text {

        private String content;

        private Link link;

        @Data
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class Link {

            private String url;

        }


    }

}
