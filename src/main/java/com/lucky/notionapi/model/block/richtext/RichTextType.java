package com.lucky.notionapi.model.block.richtext;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.lucky.notionapi.model.block.richtext.type.EquationRichText;
import com.lucky.notionapi.model.block.richtext.type.MentionRichText;
import com.lucky.notionapi.model.block.richtext.type.TextRichText;

import static com.lucky.notionapi.model.block.richtext.RichTextType.*;

/**
 * @author jiahe
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = TextRichText.class)
@JsonSubTypes({
        @Type(value = TextRichText.class, name = TEXT),
        @Type(value = MentionRichText.class, name = MENTION),
        @Type(value = EquationRichText.class, name = EQUATION),
})
public interface RichTextType {

    /**
     * 文本
     */
    String TEXT = "text";
    /**
     * 提到
     */
    String MENTION = "mention";
    /**
     * 方程
     */
    String EQUATION = "equation";

}
