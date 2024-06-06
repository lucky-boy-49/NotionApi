package com.lucky.notionapi.dao.propertyitem.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.dao.propertyitem.AbstractPropertyItem;
import com.lucky.notionapi.model.communal.richtext.RichTextType;
import jakarta.validation.Valid;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 标题属性值对象包含 title 属性中的富文本对象数组。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TitlePropertyDao extends AbstractPropertyItem {

    /**
     * 标题属性值对象包含 title 属性中的富文本对象。
     *
     * @see RichTextType
     */
    @Valid
    private RichTextType title;

}
