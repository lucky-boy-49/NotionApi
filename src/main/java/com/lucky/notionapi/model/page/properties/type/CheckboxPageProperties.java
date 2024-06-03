package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.model.page.properties.AbstractPageProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 复选框
 *
 * @author 贺佳
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckboxPageProperties extends AbstractPageProperties {

    /**
     * 复选框是选中（ true ）还是未选中（ false ）。
     */
    private Boolean checkbox;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public CheckboxPageProperties(Boolean initType) {
        if (initType) {
            type = CHECKBOX;
        }
    }

}
