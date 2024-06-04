package com.lucky.notionapi.model.database.filter.conditions;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * 抽象过滤器对象
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class AbstratctFilterObject implements FilterObject {

    /**
     * 数据库中的属性名称或属性 ID。
     */
    protected String property;

}
