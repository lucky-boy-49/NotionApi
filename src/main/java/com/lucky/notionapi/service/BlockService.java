package com.lucky.notionapi.service;

import com.lucky.notionapi.dao.BlockAddRequestDao;
import com.lucky.notionapi.dao.BlockAddResponseDao;
import com.lucky.notionapi.model.block.BlockType;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PatchExchange;

/**
 * Notion块服务接口<br>
 * 追加子块、检索子块、检索块孩子、更新块、删除块
 *
 * @author jiahe
 */
@HttpExchange("/v1/blocks/")
public interface BlockService {

    /**
     * 创建新的子块并将其附加到指定的父块 block_id 中。块可以是其他块、页面或数据库的父级。<br>
     * 返回新创建的第一级子块对象的分页列表。<br>
     * 无法使用此端点移动现有块。块被附加到父块的底部。要将块附加到父块底部以外的特定位置，请使用 "after" 参数并将其值设置为应在其后附加新块
     * 的块的 ID。一旦将块作为子块附加，就无法通过 API 将其移动到其他地方。<br>
     * 单个 API 请求最多可以附加 100 个子块。子块数组长度超过 100 将导致错误。<br>
     * <a href="https://developers.notion.com/reference/patch-block-children">追加块子项</a>
     * @param requestBody 作为块对象数组附加到容器块的子内容
     * @param blockId     块的标识符。还接受页面 ID。
     * @return 一级子块对象的分页列表
     */
    @PatchExchange(value = "/{blockId}/children", contentType = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<BlockAddResponseDao> appendBlockChildren(@RequestBody BlockAddRequestDao requestBody, @PathVariable String blockId);

    /**
     * 使用指定的 ID 检索 Block 对象。<br>
     * 如果返回的块包含键 has_children: true ，请使用检索块子项端点来获取子项列表。<br>
     * 要检索特定页面的页面内容，请使用检索块子级并将页面 ID 设置为 block_id 。<br>
     * <a href="https://developers.notion.com/reference/retrieve-a-block">检索一个块</a>
     *
     * @param blockId 块id
     * @return 块对象
     */
    @GetExchange("/{blockId}")
    ResponseEntity<BlockType> retrieveBlock(@PathVariable String blockId);

}
