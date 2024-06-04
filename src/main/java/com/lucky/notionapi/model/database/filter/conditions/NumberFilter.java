package com.lucky.notionapi.model.database.filter.conditions;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 数字过滤器
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NumberFilter extends AbstratctFilterObject {

    private NumberConditions number;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class NumberConditions {

        /**
         * 返回编号属性值与提供的 number 不同的数据库条目。
         */
        @JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
        @JsonProperty("does_not_equal")
        private Number doesNotEqual;

        /**
         * 返回数字属性值与提供的数字相同的数据库条目。
         */
        @JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
        private Number equals;

        /**
         * 返回数量属性值超过所提供的 number 值的数据库条目。
         */
        @JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
        @JsonProperty("greater_than")
        private Number greaterThan;

        /**
         * 返回数字属性值等于或大于所提供的 number 的数据库条目。
         */
        @JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
        @JsonProperty("greater_than_or_equal_to")
        private Number greaterThanOrEqualTo;

        /**
         * 返回数字属性值不包含任何数据的数据库条目。
         */
        @JsonProperty("is_empty")
        private Boolean isEmpty;

        /**
         * 返回数字属性值包含数据的数据库条目。
         */
        @JsonProperty("is_not_empty")
        private Boolean isNotEmpty;

        /**
         * 返回数字属性值小于所提供的 number 的数据库条目。
         */
        @JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
        @JsonProperty("less_than")
        private Number lessThan;

        /**
         * 返回数字属性值等于或小于所提供的 number 的数据库条目。
         */
        @JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
        @JsonProperty("less_than_or_equal_to")
        private Number lessThanOrEqualTo;

    }

}
