package com.lucky.notionapi.model.database.filter.conditions;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 函数过滤器<br>
 * formula 过滤条件对象的主字段与公式结果的类型相匹配。例如，要过滤计算 checkbox 的公式属性，请使用
 * formula 过滤条件对象，并将包含复选框过滤条件的 checkbox 字段作为其值。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormulaFilter extends AbstratctFilterObject {

    private FormulaConditions formula;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class FormulaConditions {

        /**
         * 复选框过滤条件，用于比较公式结果。
         */
        private CheckboxFilter checkbox;

        /**
         * 日期筛选条件，用于比较公式结果。
         */
        private DateFilter date;

        /**
         * 返回公式结果符合所提供条件的数据库条目。
         */
        private NumberFilter number;

        /**
         * 返回公式结果符合所提供条件的数据库条目。
         */
        private RichTextFilter string;

    }

}
