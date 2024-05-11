package com.lucky.notionapi.model.block;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.lucky.notionapi.enumerate.BlockType;
import com.lucky.notionapi.model.parent.Parent;
import com.lucky.notionapi.model.parent.type.BlockParent;
import com.lucky.notionapi.model.parent.type.DatabaseParent;
import com.lucky.notionapi.model.parent.type.PageParent;
import com.lucky.notionapi.model.parent.type.WorkspaceParent;
import com.lucky.notionapi.model.user.User;
import com.lucky.notionapi.model.user.type.Bots;
import com.lucky.notionapi.model.user.type.People;
import com.lucky.notionapi.utils.serializer.BlockStyleDeserializerUtil;

import java.time.LocalDateTime;

/**
 * 块的抽象类，定义块的基本信息
 * @author jiahe
 */
public class Block {

    /**
     * 块的类型,始终为"block"。
     */
    public final String object = "block";

    /**
     * 块的标识符。UUIDv4
     */
    public String id;

    /**
     * 块的父块的信息，块父类类型有{@link BlockParent}、{@link PageParent}、{@link DatabaseParent}、{@link WorkspaceParent}
     */
    public Parent parent;

    /**
     * 创建此块的日期和时间。格式为 ISO 8601 日期时间字符串。
     */
    @JsonProperty("created_time")
    public LocalDateTime createdTime;

    /**
     * 创建该块的用户。用户类型{@link People}、{@link Bots}
     */
    @JsonProperty("created_by")
    public User createdBy;

    /**
     * 该块上次更新的日期和时间。格式为 ISO 8601 日期时间字符串。
     */
    @JsonProperty("last_edited_time")
    public LocalDateTime lastEditedTime;

    /**
     * 最后编辑该块的用户。
     */
    @JsonProperty("last_edited_by")
    public User lastEditedBy;

    /**
     * 该块是否已被删除。
     */
    @JsonProperty("in_trash")
    public Boolean inTrash;

    /**
     * 该块是否有嵌套在其中的子块。
     */
    @JsonProperty("has_children")
    public Boolean hasChildren;

    /**
     * 块类型。枚举{@link BlockType}
     */
    public String type;

    @JsonDeserialize(using = BlockStyleDeserializerUtil.class)
    public BlockStyle style;

}
