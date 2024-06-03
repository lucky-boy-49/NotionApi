package com.lucky.notionapi.dao.propertyitem.type.rollup;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.lucky.notionapi.dao.propertyitem.type.rollup.type.ArrayRollupProperty;
import com.lucky.notionapi.dao.propertyitem.type.rollup.type.DateRollupProperty;
import com.lucky.notionapi.dao.propertyitem.type.rollup.type.IncompleteRollupProperty;
import com.lucky.notionapi.dao.propertyitem.type.rollup.type.NumberRollupProperty;

import static com.lucky.notionapi.dao.propertyitem.type.rollup.Rollup.*;

/**
 * 汇总接口<br>
 * 汇总属性值对象表示对汇总属性进行评估的结果。<br>
 * 数据库的属性。属性将作为 list 类型为 property_item 的对象返回，其中包含一个 relation 项列表，用于计算 results 下的卷积。<br>
 * 在 property_type 键下还会返回一个 rollup 属性项，用于描述滚动聚合和计算结果。<br>
 * 为了避免超时，如果滚动具有大量聚合或属性，端点会返回一个 next_cursor 值，用于确定已分页过的关系子集的聚合值。<br>
 * 一旦 has_more 为 false ，就会返回最终地滚动值。<br>
 * 不支持计算以下聚合的值。相反，端点会返回一个 property_item 对象的列表：show_unique、unique、median<br>
 *
 * @author jiahe
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = NumberRollupProperty.class,
        include = JsonTypeInfo.As.EXISTING_PROPERTY)
@JsonSubTypes({
        @Type(value = NumberRollupProperty.class, name = NUMBER),
        @Type(value = DateRollupProperty.class, name = DATE),
        @Type(value = ArrayRollupProperty.class, name = ARRAY),
        @Type(value = NumberRollupProperty.class, name = UNSUPPORTED),
        @Type(value = IncompleteRollupProperty.class, name = INCOMPLETE)
})
public interface Rollup {

    /**
     * 编号滚动属性值
     */
    String NUMBER = "number";

    /**
     * 日期滚动属性值
     */
    String DATE = "date";

    /**
     * 数组汇总属性值
     */
    String ARRAY = "array";

    /**
     * 不支持汇总属性值
     */
    String UNSUPPORTED = "unsupported";

    /**
     * 不完整的汇总属性值
     */
    String INCOMPLETE = "incomplete";

}
