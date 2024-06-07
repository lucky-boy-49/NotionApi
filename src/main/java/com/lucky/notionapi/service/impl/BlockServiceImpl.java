package com.lucky.notionapi.service.impl;

import com.lucky.notionapi.annotation.Notion;
import com.lucky.notionapi.dao.BlockAddDao;
import com.lucky.notionapi.dto.BlockDto;
import com.lucky.notionapi.mapper.NotionBlockService;
import com.lucky.notionapi.model.block.BlockType;
import com.lucky.notionapi.service.BlockService;
import com.lucky.notionapi.utils.ObjectMapperUtil;
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
public class BlockServiceImpl implements BlockService {

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
    @Override
    @Notion("追加块子项")
    public BlockDto appendBlockChildren(BlockAddDao requestDao, String blockId) {
        String body = ObjectMapperUtil.toJson(requestDao);
        NotionBlockService service = factory.createClient(NotionBlockService.class);
        ResponseEntity<BlockDto> response = service.appendBlockChildren(body, blockId);
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
    @Override
    @Notion("追加块子项")
    public BlockDto appendBlockChildren(String bodyJson, String blockId) {
        NotionBlockService service = factory.createClient(NotionBlockService.class);
        ResponseEntity<BlockDto> response = service.appendBlockChildren(bodyJson, blockId);
        return Objects.requireNonNull(response.getBody());
    }

    /**
     * 检索一个块<br>
     *
     * @param blockId 块的标识符。
     * @return 块对象
     */
    @Override
    @Notion("检索一个块")
    public BlockType retrieveBlock(String blockId) {
        NotionBlockService service = factory.createClient(NotionBlockService.class);
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
    @Override
    @Notion("检索块的子块")
    public BlockDto retrieveBlockChildren(String blockId, String startCursor, Integer pageSize) {
        Map<String, Object> params = new HashMap<>();
        if (startCursor != null) {
            params.put("start_cursor", startCursor);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        NotionBlockService service = factory.createClient(NotionBlockService.class);
        ResponseEntity<BlockDto> response = service.retrieveBlockChildren(blockId, params);
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
    @Override
    @Notion("更新块内容")
    public BlockType updateBlock(String blockId, BlockType block) {
        String body = ObjectMapperUtil.toJson(block);
        NotionBlockService service = factory.createClient(NotionBlockService.class);
        ResponseEntity<BlockType> response = service.updateBlock(blockId, body);
        return Objects.requireNonNull(response.getBody());
    }

    /**
     * 删除块<br>
     *
     * @param blockId 块id
     * @return 块信息
     */
    @Override
    @Notion("删除块")
    public BlockType deleteBlock(String blockId) {
        NotionBlockService service = factory.createClient(NotionBlockService.class);
        ResponseEntity<BlockType> response = service.deleteBlock(blockId);
        return Objects.requireNonNull(response.getBody());
    }

}
