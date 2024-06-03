package com.lucky.notionapi.dao.propertyitem.type.rollup.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.dao.propertyitem.type.rollup.AbstractRollup;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 不完整的汇总属性值<br>
 * 汇总结果超过一页的汇总滚动将返回 "incomplete" 类型的 rollup 对象。要获得最终值，请使用 next_cursor 或 next_url 属性在滚动中的下一个值之间进行分页。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IncompleteRollupProperty extends AbstractRollup {

    private Incomplete incomplete;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public IncompleteRollupProperty(Boolean initType) {
        if (initType) {
            type = INCOMPLETE;
        }
    }

    @Data
    public static class Incomplete {

    }

}
