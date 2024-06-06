package com.lucky.notionapi.model.communal.richtext.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.model.communal.richtext.AbstractRichText;
import com.lucky.notionapi.model.communal.richtext.type.mention.Mention;
import jakarta.validation.Valid;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 提到
 *
 * @author 贺佳
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MentionRichText extends AbstractRichText {

    @Valid
    private Mention mention;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public MentionRichText(Boolean initType) {
        if (initType) {
            type = MENTION;
        }
    }

}
