package com.lucky.notionapi.model.database.filter.conditions;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * ID过滤器
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IDFilter extends AbstratctFilterObject {

    @JsonProperty("unique_id")
    private UniqueIdConditions uniqueId;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class UniqueIdConditions {

        /**
         * 返回 unique_id 属性值与提供值不同的数据库条目。
         */
        @JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
        @JsonProperty("does_not_equal")
        private Number doesNotEqual;

        /**
         * 返回 unique_id 属性值与提供值相同的数据库条目。
         */
        @JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
        private Number equals;

        /**
         * 返回 unique_id 属性值超过提供值的数据库条目。
         */
        @JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
        @JsonProperty("greater_than")
        private Number greaterThan;

        /**
         * 返回 unique_id 属性值等于或大于所提供值的数据库条目。
         */
        @JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
        @JsonProperty("greater_than_or_equal_to")
        private Number greaterThanOrEqualTo;

        /**
         * 返回 unique_id 属性值小于提供值的数据库条目。
         */
        @JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
        @JsonProperty("less_than")
        private Number lessThan;

        /**
         * 返回 unique_id 属性值等于或小于提供值的数据库条目。
         */
        @JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
        @JsonProperty("less_than_or_equal_to")
        private Number lessThanOrEqualTo;

    }

}
