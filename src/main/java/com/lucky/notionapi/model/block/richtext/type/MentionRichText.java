package com.lucky.notionapi.model.block.richtext.type;

import com.lucky.notionapi.model.block.richtext.RichTextType;
import com.lucky.notionapi.model.block.richtext.type.mention.Mention;
import lombok.Data;

/**
 * 提到
 *
 * @author 贺佳
 */
@Data
public class MentionRichText implements RichTextType {

    private String type;

    private Mention mention;

}
