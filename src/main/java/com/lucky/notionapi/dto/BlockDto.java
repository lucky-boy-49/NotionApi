package com.lucky.notionapi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.config.NotionConfig;
import com.lucky.notionapi.model.block.BlockType;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 * 追加块响应数据
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockDto {

    /**
     * 响应类型
     */
    private String object;

    /**
     * 块结果
     */
    @Valid
    @Size(max = NotionConfig.BLOCK_ARRAY_SIZE, message = NotionConfig.BLOCK_ARRAY_MESSAGE)
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
    @Valid
    private BlockType block;

}
