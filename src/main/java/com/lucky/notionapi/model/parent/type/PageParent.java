package com.lucky.notionapi.model.parent.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.parent.AbstractParent;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 页面父级
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PageParent extends AbstractParent {

    /**
     * 该页面所属页面的ID。UUIDv4
     */
    @JsonProperty("page_id")
    private String pageId;

    public PageParent() {
        // 始终为"page_id"
        type = "page_id";
    }

    @Override
    public String getType() {
        return type;
    }
}
