package com.lucky.notionapi.dao.propertyitem.type.formula.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.dao.propertyitem.type.formula.AbstractFormula;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 字符串公式属性值在 string 属性中包含一个可选字符串。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StringFormulaProperty extends AbstractFormula {

    private String string;

}
