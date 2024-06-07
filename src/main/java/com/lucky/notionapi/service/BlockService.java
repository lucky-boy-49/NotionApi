package com.lucky.notionapi.service;

import com.lucky.notionapi.dao.BlockAddRequestDao;
import com.lucky.notionapi.dao.BlockResponseDao;
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

    @Validated
    BlockResponseDao appendBlockChildren(@Valid BlockAddRequestDao requestDao, @NotNull String blockId);

    @Validated
    BlockResponseDao appendBlockChildren(String bodyJson, @NotNull String blockId);

    @Validated
    BlockType retrieveBlock(@NotNull String blockId);

    @Validated
    BlockResponseDao retrieveBlockChildren(@NotNull String blockId, @Nullable String startCursor, @Nullable Integer pageSize);

    @Validated
    BlockType updateBlock(@NotNull String blockId, @Valid BlockType block);

    @Validated
    BlockType deleteBlock(@NotNull String blockId);

}
