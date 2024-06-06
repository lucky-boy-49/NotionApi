package com.lucky.notionapi.dao;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.config.NotionConfig;
import com.lucky.notionapi.model.block.BlockType;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 * 追加块请求数据
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockAddRequestDao {

    /**
     * 作为块对象数组附加到容器块的子内容
     */
    @Valid
    @Size(max = NotionConfig.BLOCK_ARRAY_SIZE, message = NotionConfig.BLOCK_ARRAY_MESSAGE)
    private BlockType[] children;

    /**
     * 应在其后附加新块的现有块的 ID。
     */
    private String after;

}
