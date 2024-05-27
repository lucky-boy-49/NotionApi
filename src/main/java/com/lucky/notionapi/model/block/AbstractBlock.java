package com.lucky.notionapi.model.block;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.parent.Parent;
import com.lucky.notionapi.model.parent.type.BlockParent;
import com.lucky.notionapi.model.parent.type.DatabaseParent;
import com.lucky.notionapi.model.parent.type.PageParent;
import com.lucky.notionapi.model.parent.type.WorkspaceParent;
import com.lucky.notionapi.model.user.User;
import com.lucky.notionapi.model.user.type.Bots;
import com.lucky.notionapi.model.user.type.People;
import lombok.Data;

/**
 * 块的抽象类，定义块的基本信息
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class AbstractBlock implements BlockType {

    /**
     * 块的类型,始终为"block"。
     */
    protected String object = "block";

    /**
     * 块的标识符。UUIDv4
     */
    protected String id;

    /**
     * 块的父块的信息，块父类类型有{@link BlockParent}、{@link PageParent}、{@link DatabaseParent}、{@link WorkspaceParent}
     */
    protected Parent parent;

    /**
     * 创建此块的日期和时间。格式为 ISO 8601 日期时间字符串。
     */
    @JsonProperty("created_time")
    protected String createdTime;

    /**
     * 创建该块的用户。用户类型{@link People}、{@link Bots}
     */
    @JsonProperty("created_by")
    protected User createdBy;

    /**
     * 该块上次更新的日期和时间。格式为 ISO 8601 日期时间字符串。
     */
    @JsonProperty("last_edited_time")
    protected String lastEditedTime;

    /**
     * 最后编辑该块的用户。
     */
    @JsonProperty("last_edited_by")
    protected User lastEditedBy;

    /**
     * 该块是否已被删除。
     */
    @JsonProperty("in_trash")
    protected Boolean inTrash;

    /**
     * 该块是否有嵌套在其中的子块。
     */
    @JsonProperty("has_children")
    protected Boolean hasChildren;

    /**
     * 块类型。
     */
    protected String type;

}
