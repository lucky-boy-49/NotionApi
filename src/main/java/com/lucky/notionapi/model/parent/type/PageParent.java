package com.lucky.notionapi.model.parent.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.parent.AbstractParent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 页面父级
 * @author jiahe
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PageParent extends AbstractParent {

    /**
     * 该页面所属页面的ID。UUIDv4
     */
    @JsonProperty("page_id")
    private String pageId;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public PageParent(Boolean initType) {
        if (initType) {
            type = "page_id";
        }
    }

    @Override
    public String getType() {
        return type;
    }
}
