package com.lucky.notionapi.model.block.type;

import com.fasterxml.jackson.annotation.JsonInclude;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BreadcrumbBlock extends AbstractBlock {

    /**
     * 面包屑
     */
    private Breadcrumb breadcrumb;

    /**
     * 构造函数，创建给{@link #type}赋值的对象
     */
    public BreadcrumbBlock() {
        type = BREADCRUMB;
    }

    /**
     * 面包屑对象
     */
    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Breadcrumb {
    }

}
