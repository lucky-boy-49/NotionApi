package com.lucky.notionapi.service;

import com.lucky.notionapi.model.page.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

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
    @PostExchange
    ResponseEntity<Page> createPage(@RequestBody String page);

}
