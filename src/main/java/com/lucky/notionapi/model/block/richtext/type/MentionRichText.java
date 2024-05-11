package com.lucky.notionapi.model.block.richtext.type;

import com.lucky.notionapi.model.block.richtext.AbstractRichText;
import com.lucky.notionapi.model.block.richtext.type.mention.Mention;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 提到
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MentionRichText extends AbstractRichText {

    private Mention mention;

}
