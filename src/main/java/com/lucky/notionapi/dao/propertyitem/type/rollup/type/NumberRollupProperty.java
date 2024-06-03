package com.lucky.notionapi.dao.propertyitem.type.rollup.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.dao.propertyitem.type.rollup.AbstractRollup;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 编号滚动属性值<br>
 * 数字滚动属性值包含 number 属性中的一个数字。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NumberRollupProperty extends AbstractRollup {

    private Integer number;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public NumberRollupProperty(Boolean initType) {
        if (initType) {
            type = NUMBER;
        }
    }

}
