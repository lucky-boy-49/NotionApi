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

}
