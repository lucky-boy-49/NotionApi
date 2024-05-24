package com.lucky.notionapi.dao.propertyitem.type.formula.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.dao.propertyitem.type.formula.AbstractFormula;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 布尔公式属性值在 boolean 属性中包含一个布尔值。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BooleanFormulaProperty extends AbstractFormula {

    @JsonProperty("boolean")
    private Boolean aBoolean;

}
