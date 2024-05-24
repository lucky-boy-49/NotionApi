package com.lucky.notionapi.dao.propertyitem.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.dao.propertyitem.AbstractPropertyItem;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 数字属性值对象在 number 属性中包含一个数字。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NumberPropertyDao extends AbstractPropertyItem {

    private Integer number;

}
