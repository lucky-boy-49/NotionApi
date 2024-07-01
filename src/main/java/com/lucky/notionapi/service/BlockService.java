package com.lucky.notionapi.service;

import com.lucky.notionapi.dao.BlockAddDao;
import com.lucky.notionapi.dto.BlockDto;
import com.lucky.notionapi.model.block.BlockType;
import jakarta.annotation.Nullable;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * 块服务接口
 * @author jiahe
 */
@Validated
public interface BlockService {

    /**
     * 追加块子项
     *
     * @param requestDao 请求参数
     * @param blockId    块id
     * @return 块
     */
    @Validated
    BlockDto appendBlockChildren(@Valid BlockAddDao requestDao, @NotNull String blockId);

    /**
     * 追加块子项
     *
     * @param bodyJson 请求参数
     * @param blockId 块id
     * @return 块
     */
    @Validated
    BlockDto appendBlockChildren(String bodyJson, @NotNull String blockId);

    /**
     * 检索一个块
     * @param blockId 块id
     * @return 块信息
     */
    @Validated
    BlockType retrieveBlock(@NotNull String blockId);

    /**
     * 检索一个块的子项
     *
     * @param blockId 块id
     * @param startCursor 开始游标
     * @param pageSize 页面大小
     * @return 块信息
     */
    @Validated
    BlockDto retrieveBlockChildren(@NotNull String blockId, @Nullable String startCursor, @Nullable Integer pageSize);

    /**
     * 更新一个块
     *
     * @param blockId 块id
     * @param block 更新内容
     * @return 块
     */
    @Validated
    BlockType updateBlock(@NotNull String blockId, @Valid BlockType block);

    /**
     * 删除块
     * @param blockId 块id
     * @return 块信息
     */
    @Validated
    BlockType deleteBlock(@NotNull String blockId);

}
