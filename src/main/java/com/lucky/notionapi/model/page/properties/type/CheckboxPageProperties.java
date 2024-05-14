package com.lucky.notionapi.model.page.properties.type;

import com.lucky.notionapi.model.block.AbstractBlock;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 复选框
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CheckboxPageProperties extends AbstractBlock {

    /**
     * 复选框是选中（ true ）还是未选中（ false ）。
     */
    private Boolean checkbox;

}
