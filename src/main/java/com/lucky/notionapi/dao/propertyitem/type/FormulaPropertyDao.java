package com.lucky.notionapi.dao.propertyitem.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.dao.propertyitem.AbstractPropertyItem;
import com.lucky.notionapi.dao.propertyitem.type.formula.Formula;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 公式属性值
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormulaPropertyDao extends AbstractPropertyItem {

    private Formula formula;

}
