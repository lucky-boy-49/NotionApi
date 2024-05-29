package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.model.communal.Formula;
import com.lucky.notionapi.model.page.properties.AbstractPageProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 公式
 * 属性值对象表示评估公式中描述的结果
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormulaPageProperties extends AbstractPageProperties {

    private Formula formula;

    public FormulaPageProperties() {
        type = FORMULA;
    }

}
