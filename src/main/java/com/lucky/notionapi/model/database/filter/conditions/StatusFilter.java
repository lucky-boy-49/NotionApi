package com.lucky.notionapi.model.database.filter.conditions;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 状态过滤器
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatusFilter extends AbstratctFilterObject {

    private StatusConditions status;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class StatusConditions {

        /**
         * 返回状态属性值与所提供字符串匹配的数据库条目。
         */
        private String equals;

        /**
         * 返回状态属性值与提供的字符串不匹配的数据库条目。
         */
        @JsonProperty("does_not_equal")
        private String doesNotEqual;

        /**
         * 返回状态属性值为空的数据库条目。
         */
        @JsonProperty("is_empty")
        private Boolean isEmpty;

        /**
         * 返回状态属性值不为空的数据库条目。
         */
        @JsonProperty("is_not_empty")
        private Boolean isNotEmpty;

    }

}
