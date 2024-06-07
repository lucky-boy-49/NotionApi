package com.lucky.notionapi.model.communal.richtext.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.config.NotionConfig;
import com.lucky.notionapi.model.communal.richtext.AbstractRichText;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 如果富文本对象的 type 值为 "text"
 * @author 贺佳
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TextRichText extends AbstractRichText {

    @Valid
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

    /**
     * 初始化一个最简单的富文本对象
     *
     * @param content 文本内容
     */
    public TextRichText(String content) {
        type = TEXT;
        text = new Text(content);
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Text {

        public Text(String content) {
            this.content = content;
        }

        @Size(max = NotionConfig.TEXT_CONTENT_SIZE, message = NotionConfig.TEXT_CONTENT_MESSAGE)
        private String content;

        @Valid
        private Link link;

        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class Link {

            @Size(max = NotionConfig.TEXT_LINK_URL_SIZE, message = NotionConfig.TEXT_LINK_URL_MESSAGE)
            private String url;

        }


    }

}
