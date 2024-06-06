package com.lucky.notionapi.dao.propertyitem.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.dao.propertyitem.AbstractPropertyItem;
import com.lucky.notionapi.model.communal.richtext.RichTextType;
import jakarta.validation.Valid;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 富文本属性值对象包含 rich_text 属性中的富文本对象数组。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RichTextPropertyDao extends AbstractPropertyItem {

    @Valid
    @JsonProperty("rich_text")
    private RichTextType richText;

}
