package com.lucky.notionapi.service.impl;

import com.lucky.notionapi.annotation.Notion;
import com.lucky.notionapi.dao.BlockAddRequestDao;
import com.lucky.notionapi.dao.BlockResponseDao;
import com.lucky.notionapi.model.block.AbstractBlock;
import com.lucky.notionapi.model.block.BlockType;
import com.lucky.notionapi.service.BlockService;
import com.lucky.notionapi.utils.ObjectMapperUtil;
import jakarta.annotation.Nullable;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 块服务
 *
 * @author jiahe
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class BlockServiceImpl {

    private final HttpServiceProxyFactory factory;

    /**
     * 追加块子项<br>
     * 将一个块对象数组附加到容器块的子内容。<br>
     * 如果块已经有子内容，则新的子内容将被添加到现有子内容之后。<br>
     * 例子：<a href="https://developers.notion.com/reference/patch-block-children" target="_blank">追加子块</a>
     *
     * @param requestDao 作为块对象数组附加到容器块的子内容
     * @param blockId    块的标识符。还接受页面 ID。
     * @return 一级子块对象的分页列表
     */
    @Notion("追加块子项")
    public BlockResponseDao appendBlockChildren(BlockAddRequestDao requestDao, String blockId) {
        String body = ObjectMapperUtil.toJson(requestDao);
        BlockService service = factory.createClient(BlockService.class);
        ResponseEntity<BlockResponseDao> response = service.appendBlockChildren(body, blockId);
        return Objects.requireNonNull(response.getBody());
    }

    /**
     * 追加块子项<br>
     * 将一个块对象数组附加到容器块的子内容。<br>
     * 如果块已经有子内容，则新的子内容将被添加到现有子内容之后。<br>
     * 例子：<a href="https://developers.notion.com/reference/patch-block-children" target="_blank">追加子块</a>
     *
     * @param bodyJson 作为块对象数组附加到容器块的子内容 json格式
     * @param blockId  块的标识符。还接受页面 ID。
     * @return 一级子块对象的分页列表
     */
    @Notion("追加块子项")
    public BlockResponseDao appendBlockChildren(String bodyJson, String blockId) {
        BlockService service = factory.createClient(BlockService.class);
        ResponseEntity<BlockResponseDao> response = service.appendBlockChildren(bodyJson, blockId);
        return Objects.requireNonNull(response.getBody());
    }

    /**
     * 检索一个块<br>
     *
     * @param blockId 块的标识符。
     * @return 块对象
     */
    @Notion("检索一个块")
    public BlockType retrieveBlock(String blockId) {
        BlockService service = factory.createClient(BlockService.class);
        ResponseEntity<BlockType> response = service.retrieveBlock(blockId);
        return Objects.requireNonNull(response.getBody());
    }

    /**
     * 检索块的子块<br>
     * 检索一个块的子块。<br>
     * 例子：<a href="https://developers.notion.com/reference/get-block-children" target="_blank">检索块的子块</a>
     *
     * @param blockId     块的标识符。
     * @param startCursor 分页的起始游标。
     * @param pageSize    分页的大小。
     * @return 一级子块对象的分页列表
     */
    @Notion("检索块的子块")
    public BlockResponseDao retrieveBlockChildren(String blockId, @Nullable String startCursor, @Nullable Integer pageSize) {
        Map<String, Object> params = new HashMap<>();
        if (startCursor != null) {
            params.put("start_cursor", startCursor);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        BlockService service = factory.createClient(BlockService.class);
        ResponseEntity<BlockResponseDao> response = service.retrieveBlockChildren(blockId, params);
        return Objects.requireNonNull(response.getBody());
    }

    /**
     * 更新块内容<br>
     * 更新一个块的内容。<br>
     * 例子：<a href="https://developers.notion.com/reference/update-a-block" target="_blank">更新块内容</a>
     *
     * @param blockId   块id。
     * @param block 更新的块内容
     * @return 更新后的块对象
     */
    @Notion("更新块内容")
    public BlockType updateBlock(String blockId, AbstractBlock block) {
        String body = ObjectMapperUtil.toJson(block);
        BlockService service = factory.createClient(BlockService.class);
        ResponseEntity<BlockType> response = service.updateBlock(blockId, body);
        return Objects.requireNonNull(response.getBody());
    }

    /**
     * 删除块<br>
     *
     * @param blockId 块id
     * @return 块信息
     */
    @Notion("删除块")
    public BlockType deleteBlock(String blockId) {
        BlockService service = factory.createClient(BlockService.class);
        ResponseEntity<BlockType> response = service.deleteBlock(blockId);
        return Objects.requireNonNull(response.getBody());
    }

}
