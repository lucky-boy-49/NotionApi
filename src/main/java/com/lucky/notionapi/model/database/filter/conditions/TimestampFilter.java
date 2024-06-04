package com.lucky.notionapi.model.database.filter.conditions;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 使用时间戳筛选条件，根据 created_time 或 last_edited_time 值筛选结果。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TimestampFilter extends AbstratctFilterObject {

    /**
     * 常量字符串，代表用作筛选器的时间戳类型。创建时间/最后编辑时间<br>
     * timestamp 过滤条件不需要属性名称。如果您提供了属性名称，API 就会出错。
     */
    private String timestamp;

    /**
     * 日期筛选条件，用于筛选指定的时间戳。创建时间
     */
    @JsonProperty("created_time")
    private DateFilter createdTime;

    /**
     * 日期筛选条件，用于筛选指定的时间戳。 最后编辑时间
     */
    @JsonProperty("last_edited_time ")
    private DateFilter lastEditedTime;

}
