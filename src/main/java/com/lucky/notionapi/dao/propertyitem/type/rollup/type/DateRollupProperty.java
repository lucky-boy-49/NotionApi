package com.lucky.notionapi.dao.propertyitem.type.rollup.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.dao.propertyitem.type.rollup.AbstractRollup;
import com.lucky.notionapi.model.communal.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 日期滚动属性值<br>
 * 日期滚动属性值包含 date 属性中的日期属性值。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DateRollupProperty extends AbstractRollup {

    private Date date;

}
