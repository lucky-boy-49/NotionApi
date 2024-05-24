package com.lucky.notionapi.dao.propertyitem.type.rollup;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.enumerate.RollupFunction;
import lombok.Data;

/**
 * 汇总属性抽象类
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AbstractRollup implements Rollup {

    /**
     * 滚动类型。可能的值是 "number" , "date" , "array" , "unsupported" 和 "incomplete" 。
     */
    private String type;

    /**
     * 描述所使用的方法。<br>
     *
     * @see RollupFunction
     */
    private String function;

}
