package com.lucky.notionapi.dao.propertyitem.type.rollup.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.dao.propertyitem.PropertyItem;
import com.lucky.notionapi.dao.propertyitem.type.rollup.AbstractRollup;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 数组汇总属性值<br>
 * 数组汇总属性值包含 results 属性中的 property_item 对象数组。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ArrayRollupProperty extends AbstractRollup {

    private PropertyItem[] results;

}
