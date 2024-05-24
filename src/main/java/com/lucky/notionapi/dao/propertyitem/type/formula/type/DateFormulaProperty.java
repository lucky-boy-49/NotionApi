package com.lucky.notionapi.dao.propertyitem.type.formula.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.dao.propertyitem.type.formula.AbstractFormula;
import com.lucky.notionapi.model.communal.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 日期公式属性值在 date 属性中包含一个可选的日期属性值。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DateFormulaProperty extends AbstractFormula {

    private Date date;

}
