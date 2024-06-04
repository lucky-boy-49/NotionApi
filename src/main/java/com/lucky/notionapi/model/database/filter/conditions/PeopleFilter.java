package com.lucky.notionapi.model.database.filter.conditions;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 可以将人员筛选条件应用于 people 、 created_by 和 last_edited_by 数据库属性类型。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PeopleFilter extends AbstratctFilterObject {

    private PeopleConditions people;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class PeopleConditions {

        /**
         * 返回人物属性值包含所提供的 string 的数据库条目。
         */
        private String contains;

        /**
         * 返回人员属性值不包含所提供的 string 的数据库条目。
         */
        @JsonProperty("does_not_contain")
        private String doesNotContain;

        /**
         * 返回人员属性值不包含任何数据的数据库条目。
         */
        @JsonProperty("is_empty")
        private Boolean isEmpty;

        /**
         * 返回人物属性值不为空的数据库条目。
         */
        @JsonProperty("is_not_empty")
        private Boolean isNotEmpty;

    }

}
