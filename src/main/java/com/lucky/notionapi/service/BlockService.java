package com.lucky.notionapi.service;

import com.lucky.notionapi.dao.BlockResponseDao;
import com.lucky.notionapi.model.block.BlockType;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PatchExchange;

import java.util.Map;

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
    ResponseEntity<BlockResponseDao> appendBlockChildren(@RequestBody() String requestBody, @PathVariable String blockId);

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

    /**
     * 使用指定的 ID 返回块中包含的子块对象的分页数组。为了接收块的完整表示，您可能需要递归地检索子块的子块。<br>
     * 仅返回指定块的第一级子级。<br>
     *
     * @param blockId 块id
     * @param param   {@code page_size}响应中所需的完整列表中的项目数。最多：100;{@code start_cursor}如果提供，此端点将返回从提供的光标之后开始的一页结果。如果未提供，此端点将返回结果的第一页。。
     * @return 块对象的分页列表
     */
    @GetExchange("/{blockId}/children")
    ResponseEntity<BlockResponseDao> retrieveBlockChildren(@PathVariable String blockId, @RequestParam(defaultValue = "") Map<String, Object> param);

    /**
     * 根据块类型更新指定块id的内容。<br>
     * 注意：更新将替换给定字段的整个值。如果省略字段（例如：更新 to_do 块时省略 checked ），则该值不会更改。<br>
     * 要更新“页”类型块，请使用更新页面端点。更新页面的 title 会更新关联的页块中显示的文本。<br>
     * 要更新 child_database 类型块，请使用更新数据库端点。更新页面的 title 会更新关联的 child_database 块中显示的文本。<br>
     * 块的子块不能直接使用此端点更新。而是使用 Append 块子项来添加子项。<br>
     * 要更新 heading 块的切换，您可以在请求中包含可选的 is_toggleable 属性。可以在 heading 块中添加和删除切换。但是，
     * 如果 heading 块有子项，则无法从该块中删除切换。在从 heading 块撤销切换之前，必须删除所有子级。<br>
     * @param blockId 块id
     * @param requestBody 请求体中的块对象将替换指定块的内容。
     * @return 更新后的块对象
     */
    @PatchExchange("/{blockId}")
    ResponseEntity<BlockType> updateBlock(@PathVariable String blockId, @RequestBody String requestBody);

    /**
     * 使用指定的 ID 将块对象（包括页面块）设置为 in_trash: true 。注意：在 Notion UI 应用程序中，这会将块移动到“垃圾箱”，仍然可以访问和恢复它。<br>
     * 要使用 API 恢复块，请分别使用更新块或更新页面。
     *
     * @param blockId 块id
     * @return 删除的块信息
     */
    @DeleteExchange("/{blockId}")
    ResponseEntity<BlockType> deleteBlock(@PathVariable String blockId);

}
