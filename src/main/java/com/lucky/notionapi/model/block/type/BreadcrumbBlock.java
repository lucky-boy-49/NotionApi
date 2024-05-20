package com.lucky.notionapi.model.block.type;

import com.lucky.notionapi.model.block.AbstractBlock;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 面包屑
 * 包屑块对象的 breadcrumb 属性中不包含任何信息。
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BreadcrumbBlock extends AbstractBlock {

    /**
     * 面包屑
     */
    private Breadcrumb breadcrumb;

    public BreadcrumbBlock() {
        breadcrumb = new Breadcrumb();
        type = BREADCRUMB;
    }

    static class Breadcrumb {

    }

}
