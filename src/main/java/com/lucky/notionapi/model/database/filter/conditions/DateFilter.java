package com.lucky.notionapi.model.database.filter.conditions;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 日期过滤器<br>
 * 日期筛选条件可用于限制 date 属性值类型和时间戳属性类型 created_time 和 last_edited_time 。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DateFilter extends AbstratctFilterObject {

    private DateConditions date;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class DateConditions {

        /**
         * 返回日期属性值在所提供日期之后的数据库条目。ISO 8601 日期
         */
        private String after;

        /**
         * 返回日期属性值在所提供日期之前的数据库条目。ISO 8601 日期
         */
        private String before;

        /**
         * 返回日期属性值为所提供日期的数据库条目。ISO 8601 日期
         */
        private String equals;

        /**
         * 返回日期属性值不包含数据的数据库条目。
         */
        @JsonProperty("is_empty")
        private Boolean isEmpty;

        /**
         * 返回日期属性值不为空的数据库条目。
         */
        @JsonProperty("is_not_empty")
        private Boolean isNotEmpty;

        /**
         * 该过滤器可将结果限制为日期属性值在下个月内的数据库条目。(节点值为空)
         */
        @JsonProperty("next_month")
        private ObjectNode nextMonth;

        /**
         * 该过滤器可将结果限制为日期属性值在下周内的数据库条目。(节点值为空)
         */
        @JsonProperty("next_week")
        private ObjectNode nextWeek;

        /**
         * 该过滤器可将结果限制为日期属性值在下一年内的数据库条目。(节点值为空)
         */
        @JsonProperty("next_year")
        private ObjectNode nextYear;

        /**
         * 返回日期属性值在提供的日期当日或之后的数据库条目。
         */
        @JsonProperty("on_or_after")
        private String onOrAfter;

        /**
         * 返回日期属性值在所提供日期上或之前的数据库条目。ISO 8601 日期
         */
        @JsonProperty("on_or_before")
        private String onOrBefore;

        /**
         * 该过滤器可将结果限制在 date 属性值在过去一个月内的数据库条目。(节点值为空)
         */
        @JsonProperty("past_month")
        private ObjectNode pastMonth;

        /**
         * 该过滤器可将结果限制在 date 属性值在过去一周内的数据库条目。(节点值为空)
         */
        @JsonProperty("past_week")
        private ObjectNode pastWeek;

        /**
         * 该过滤器可将结果限制在 date 属性值在过去一年内的数据库条目。(节点值为空)
         */
        @JsonProperty("past_year")
        private ObjectNode pastYear;

        /**
         * 该过滤器可将结果限制在 date 属性值为本周的数据库条目中。(节点值为空)
         */
        @JsonProperty("this_week")
        private ObjectNode thisWeek;

    }

}
