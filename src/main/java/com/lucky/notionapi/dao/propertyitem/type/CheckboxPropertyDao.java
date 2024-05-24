package com.lucky.notionapi.dao.propertyitem.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.dao.propertyitem.AbstractPropertyItem;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 复选框属性值<br>
 * 复选框属性值对象在 checkbox 属性中包含一个布尔值。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckboxPropertyDao extends AbstractPropertyItem {

    private Boolean checkbox;

}
