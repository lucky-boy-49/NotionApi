package com.lucky.notionapi.model.block.richtext.type;

import com.lucky.notionapi.model.block.richtext.RichTextType;
import lombok.Data;

/**
 * 如果富文本对象的 type 值为 "text"
 * @author 贺佳
 */
@Data
public class TextRichText implements RichTextType {

    private String type;

    private Text text;

    @Data
    static class Text {

        private String content;

        private Link link;

        @Data
        static class Link {

            private String url;

        }


    }

}
