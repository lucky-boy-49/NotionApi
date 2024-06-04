package com.lucky.notionapi.model.database.filter.conditions;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 文本过滤器
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RichTextFilter extends AbstratctFilterObject {

    @JsonProperty("rich_text")
    private RichTextConditions richText;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class RichTextConditions {

        /**
         * 返回包含所提供 string 文本属性值的数据库条目。
         */
        private String contains;

        /**
         * 返回文本属性值不包含所提供的 string 的数据库条目。
         */
        @JsonProperty("does_not_contain")
        private String doesNotContain;

        /**
         * 返回文本属性值与提供的 string 不匹配的数据库条目。
         */
        @JsonProperty("does_not_equal")
        private String doesNotEqual;

        /**
         * 返回以提供的 string 结尾的文本属性值的数据库条目。
         */
        @JsonProperty("ends_with")
        private String endsWith;

        /**
         * 返回文本属性值与提供的 string 匹配的数据库条目。
         */
        private String equals;

        /**
         * 返回文本属性值为空的数据库条目。
         */
        @JsonProperty("is_empty")
        private Boolean isEmpty;

        /**
         * 返回包含数据的文本属性值的数据库条目。
         */
        @JsonProperty("is_not_empty")
        private Boolean isNotEmpty;

        /**
         * 返回以提供的 string 开头的文本属性值的数据库条目。
         */
        @JsonProperty("starts_with")
        private String startsWith;

    }

}
