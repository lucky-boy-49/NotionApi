package com.lucky.notionapi.service;

import com.lucky.notionapi.dao.PropertyItemDao;
import com.lucky.notionapi.model.page.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

import java.util.Map;

/**
 * notion 页操作服务<br>
 * 创建页面、检索页面、检索页面属性、更新页面、删除页面
 *
 * @author jiahe
 */
@HttpExchange("/v1/pages/")
public interface PageService {

    /**
     * 创建作为现有页面或数据库的子级的新页面。<br>
     * 如果新页面是现有页面的子页面，则 title 是 properties 主体参数中唯一有效的属性。<br>
     * 如果新页面是现有数据库的子级，则 properties 对象主体参数的键必须与父数据库的属性匹配。<br>
     * 此端点可用于使用 children 选项创建包含或不包含内容的新页面。要在创建页面后将内容添加到页面，请使用 Append 块子端点。<br>
     * 请求正文，其中包含属性对象中的 rollup 、 created_by 、 created_time 、 last_edited_by 或 last_edited_time
     * 值返回错误。这些 Notion 生成的值无法通过 API 创建或更新。如果 parent 包含任何这些属性，则会自动创建新页面的相应值。<br>
     *
     * @param page 页面对象
     * @return 创建成功，页面的信息
     */
    @PostExchange()
    ResponseEntity<Page> createPage(@RequestBody String page);

    /**
     * 使用指定的 ID 检索 Page 对象。<br>
     * 响应包含页面属性，而不是页面内容。要获取页面内容，请使用检索块子端点。<br>
     * 页面属性限制为每个页面属性最多 25 个引用。要检索与具有超过 25 个引用的属性相关的数据，请使用检索页面属性端点。<br>
     * 如果页面的父对象是数据库，则属性值将符合数据库属性架构。<br>
     * 如果页面对象不是数据库的一部分，则该页面唯一可用的属性值是其 title 。<br>
     * 此端点将无法准确返回超过 25 个引用的属性<br>
     *
     * @param pageId          页面id
     * @param filterProperties 与页面关联的页面属性值 ID 的列表。使用此参数将响应限制为一个或多个特定页面属性值。要检索多个属性，
     *                         请指定每个页面属性 ID。例如： ?filter_properties=iAk8&filter_properties=b7dh 。
     * @return 页数据
     */
    @GetExchange("{pageId}")
    ResponseEntity<Page> retrievePage(@PathVariable String pageId,
                                      @RequestParam(value = "filter_properties", defaultValue = "")
                                      String[] filterProperties);

    /**
     * 为给定的 page_id 和 property_id 读取 property_item 对象。根据属性类型，返回的对象要么是一个值，要么是一个分页的属性项值列表。<br>
     * 如果一个属性项有超过 25 个引用，则应使用此端点，而不是 "检索页面"。(当列表中的引用次数超过 25 次时，"检索页面 "将不会返回完整的列表）。<br>
     * 每个单独的 property_item 属性都会有一个 type 和 type 值的键，在 type 的键下，有一个标识属性值的对象，该对象记录在属性值对象中。<br>
     * 返回分页属性项对象列表的属性类型有title、rich_text、relation、people，在这些属性项的响应对象中查找 next_url 值，以查看分页结果<br>
     *
     * @param pageId     页面id
     * @param propertyId 属性id
     * @param param      参数：{@code page_size}响应中所需的完整列表中的项目数。最多：100;{@code start_cursor}如果提供，此端点将返回从提供的光标之后开始的一页结果。如果未提供，此端点将返回结果的第一页。
     * @return 属性数据
     */
    @GetExchange("/{pageId}/properties/{propertyId}")
    ResponseEntity<PropertyItemDao> retrievePagePropertyItem(@PathVariable String pageId, @PathVariable String propertyId,
                                                             @RequestParam(defaultValue = "", required = false) Map<String, String> param);

}
