package com.lucky.notionapi.dao.propertyitem.type.formula;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.lucky.notionapi.dao.propertyitem.type.formula.type.BooleanFormulaProperty;
import com.lucky.notionapi.dao.propertyitem.type.formula.type.DateFormulaProperty;
import com.lucky.notionapi.dao.propertyitem.type.formula.type.NumberFormulaProperty;
import com.lucky.notionapi.dao.propertyitem.type.formula.type.StringFormulaProperty;

import static com.lucky.notionapi.dao.propertyitem.type.formula.Formula.*;

/**
 * 公式属性值接口<br>
 * 公式属性值对象表示对公式中描述的公式进行评估的结果。
 *
 * @author jiahe
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = StringFormulaProperty.class)
@JsonSubTypes({
        @Type(value = StringFormulaProperty.class, name = STRING),
        @Type(value = NumberFormulaProperty.class, name = NUMBER),
        @Type(value = BooleanFormulaProperty.class, name = BOOLEAN),
        @Type(value = DateFormulaProperty.class, name = DATE)
})
public interface Formula {

    String STRING = "string";

    String NUMBER = "number";

    String BOOLEAN = "boolean";

    String DATE = "date";

}
