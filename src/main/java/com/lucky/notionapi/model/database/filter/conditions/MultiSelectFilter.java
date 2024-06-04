package com.lucky.notionapi.model.database.filter.conditions;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 复选框过滤器
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MultiSelectFilter extends AbstratctFilterObject {

    @JsonProperty("multi_select")
    private MultiSelectConditions multiSelect;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class MultiSelectConditions {

        /**
         * 返回多选值与所提供字符串匹配的数据库条目。"
         */
        private String contains;

        /**
         * 返回多选值与所提供字符串不匹配的数据库条目。
         */
        @JsonProperty("does_not_contain")
        private String doesNotContain;

        /**
         * 返回多选值不包含任何数据的数据库条目。
         */
        @JsonProperty("is_empty")
        private Boolean isEmpty;

        /**
         * 返回多选值中包含数据的数据库条目。
         */
        @JsonProperty("is_not_empty")
        private Boolean isNotEmpty;

    }

}
