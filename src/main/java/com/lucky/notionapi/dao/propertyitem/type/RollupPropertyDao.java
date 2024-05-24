package com.lucky.notionapi.dao.propertyitem.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.dao.propertyitem.AbstractPropertyItem;
import com.lucky.notionapi.dao.propertyitem.type.rollup.Rollup;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 汇总属性值
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RollupPropertyDao extends AbstractPropertyItem {

    private Rollup rollup;

}
