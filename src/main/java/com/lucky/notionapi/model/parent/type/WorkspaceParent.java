package com.lucky.notionapi.model.parent.type;

import com.lucky.notionapi.model.parent.AbstractParent;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 工作区父级
 * 具有工作区父级的页面是 Notion 工作区中的顶级页面。 parent 属性是一个包含以下键的对象：
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WorkspaceParent extends AbstractParent {

    /**
     * 始终为"workspace"
     */
    private final String type = "workspace";

    /**
     * 始终为true
     */
    private final String workspace = "true";

}
