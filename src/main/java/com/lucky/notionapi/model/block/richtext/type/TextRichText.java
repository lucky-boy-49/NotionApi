package com.lucky.notionapi.model.block.richtext.type;

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
        text = new Text();
        type = TEXT;
    }

    @Data
    static class Text {

        private String content;

        private Link link;

        public Text() {
            link = new Link();
        }

        @Data
        static class Link {

            private String url;

        }


    }

}
