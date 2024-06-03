package com.lucky.notionapi.dao.propertyitem.type.formula.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.dao.propertyitem.type.formula.AbstractFormula;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 布尔公式属性值在 boolean 属性中包含一个布尔值。
 *
 * @author jiahe
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BooleanFormulaProperty extends AbstractFormula {

    @JsonProperty("boolean")
    private Boolean aBoolean;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public BooleanFormulaProperty(Boolean initType) {
        if (initType) {
            type = BOOLEAN;
        }
    }
}
