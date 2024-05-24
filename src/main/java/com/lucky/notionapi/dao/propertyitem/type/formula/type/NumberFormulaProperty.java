package com.lucky.notionapi.dao.propertyitem.type.formula.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.dao.propertyitem.type.formula.AbstractFormula;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 数字公式属性值在 number 属性中包含一个可选数字。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NumberFormulaProperty extends AbstractFormula {

    private Integer number;

}
