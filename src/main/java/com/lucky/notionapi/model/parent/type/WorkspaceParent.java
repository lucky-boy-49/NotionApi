package com.lucky.notionapi.model.parent.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.model.parent.AbstractParent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 工作区父级
 * 具有工作区父级的页面是 Notion 工作区中的顶级页面。 parent 属性是一个包含以下键的对象：
 * @author jiahe
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkspaceParent extends AbstractParent {

    /**
     * 始终为true
     */
    private final String workspace = "true";

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public WorkspaceParent(Boolean initType) {
        if (initType) {
            type = "workspace";
        }
    }

    @Override
    public String getType() {
        return type;
    }
}
