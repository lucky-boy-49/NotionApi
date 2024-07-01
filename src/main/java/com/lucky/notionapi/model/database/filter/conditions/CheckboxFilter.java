package com.lucky.notionapi.model.database.filter.conditions;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 复选框过滤条件
 *
 * @author jiahe
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckboxFilter extends AbstratctFilterObject {

    private CheckboxConditions checkbox;

    /**
     * 复选框过滤条件
     */
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class CheckboxConditions {

        /**
         * checkbox 属性值是否与提供的值完全匹配。返回或排除完全匹配值的所有数据库条目。
         */
        private Boolean equals;

        /**
         * checkbox 属性值是否与提供的值不同。返回或排除所有数值存在差异的数据库条目。
         */
        @JsonProperty("does_not_equal")
        private Boolean doesNotEqual;

    }

}
