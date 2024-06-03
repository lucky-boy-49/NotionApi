package com.lucky.notionapi.model.block.richtext.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.model.block.richtext.AbstractRichText;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 如果富文本对象的 type 值为 "text"
 * @author 贺佳
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TextRichText extends AbstractRichText {

    private Text text;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public TextRichText(Boolean initType) {
        if (initType) {
            type = TEXT;
        }
    }

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Text {

        private String content;

        private Link link;

        @Data
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class Link {

            private String url;

        }


    }

}
