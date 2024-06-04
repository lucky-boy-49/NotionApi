package com.lucky.notionapi.model.database.filter.conditions;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 关系过滤器
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RelationFilter extends AbstratctFilterObject {

    private RelationConditions relation;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class RelationConditions {

        /**
         * 返回关系属性值包含所提供的 string 的数据库条目。
         */
        private String contains;

        /**
         * 返回关系属性值不包含所提供的 string 的条目。
         */
        @JsonProperty("does_not_contain")
        private String doesNotContain;

        /**
         * 返回关系属性值不包含任何数据的数据库条目。
         */
        @JsonProperty("is_empty")
        private Boolean isEmpty;

        /**
         * 返回属性值不为空的数据库条目。
         */
        @JsonProperty("is_not_empty")
        private Boolean isNotEmpty;

    }

}
