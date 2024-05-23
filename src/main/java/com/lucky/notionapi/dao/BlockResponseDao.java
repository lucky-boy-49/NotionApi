package com.lucky.notionapi.dao;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.block.BlockType;
import lombok.Data;

/**
 * 追加块响应数据
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockResponseDao {

    /**
     * 响应类型
     */
    private String object;

    /**
     * 块结果
     */
    private BlockType[] results;

    /**
     * 下一页游标
     */
    @JsonProperty("next_cursor")
    private String nextCursor;

    /**
     * 是否有下一个
     */
    @JsonProperty("has_more")
    private Boolean hasMore;

    /**
     * 当前类型
     */
    private String type;

    /**
     * 当前块内容
     */
    private BlockType block;

}
