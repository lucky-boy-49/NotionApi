package com.lucky.notionapi.model.database.filter.conditions;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 卷积数据库属性可以求值为数组、日期或数字值。滚动属性的筛选条件包含一个 rollup 键和一个相应的对象值，该值取决于计算值类型。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RollupFilter extends AbstratctFilterObject {

    private RollupConditions rollup;

    /**
     * 用于比较每个卷积属性值的值。可以是任何其他类型的筛选条件。
     */
    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class RollupConditions {

        /**
         * 返回滚动属性值符合所提供条件的数据库条目。
         */
        private FilterObject any;

        /**
         * 返回每个卷积属性值都符合所提供条件的数据库条目。
         */
        private FilterObject every;

        /**
         * 返回没有符合所提供条件的卷积属性值的数据库条目。
         */
        private FilterObject none;

    }

}
