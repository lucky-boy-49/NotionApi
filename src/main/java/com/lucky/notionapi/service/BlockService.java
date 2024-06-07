package com.lucky.notionapi.service;

import com.lucky.notionapi.dao.BlockAddRequestDao;
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

    @Validated
    BlockDto appendBlockChildren(@Valid BlockAddRequestDao requestDao, @NotNull String blockId);

    @Validated
    BlockDto appendBlockChildren(String bodyJson, @NotNull String blockId);

    @Validated
    BlockType retrieveBlock(@NotNull String blockId);

    @Validated
    BlockDto retrieveBlockChildren(@NotNull String blockId, @Nullable String startCursor, @Nullable Integer pageSize);

    @Validated
    BlockType updateBlock(@NotNull String blockId, @Valid BlockType block);

    @Validated
    BlockType deleteBlock(@NotNull String blockId);

}
