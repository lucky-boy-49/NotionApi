package com.lucky.notionapi.model.database.filter.conditions;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 选项过滤器
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SelectFilter extends AbstratctFilterObject {

    private SelectConditions select;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SelectConditions {

        /**
         * 返回选择属性值与所提供字符串匹配的数据库条目。
         */
        private String equals;

        /**
         * 返回选择属性值与提供的 string 不匹配的数据库条目。
         */
        @JsonProperty("does_not_equal")
        private String doesNotEqual;

        /**
         * 返回选择属性值为空的数据库条目。
         */
        @JsonProperty("is_empty")
        private Boolean isEmpty;

        /**
         * 返回选择属性值不为空的数据库条目。
         */
        @JsonProperty("is_not_empty")
        private Boolean isNotEmpty;

    }

}
