package com.lucky.notionapi.mapper;

import com.lucky.notionapi.dto.QueryDatabaseDto;
import com.lucky.notionapi.model.database.Database;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PatchExchange;
import org.springframework.web.service.annotation.PostExchange;

/**
 * Notion数据库服务<br>
 * <p>创建数据库、查询数据库、检索数据库、更新数据库、更新数据库属性</p>
 *
 * @author jiahe
 */
@HttpExchange("/v1/databases/")
public interface NotionDatabaseService {

    /**
     * 创建一个数据库，作为指定父页面的子页面，并使用指定的属性模式。目前，新数据库的父页面必须是 Notion 页面或维基数据库。<br>
     *
     * @param body 数据库的内容
     * @return 数据库信息
     */
    @PostExchange
    ResponseEntity<Database> createDatabase(@RequestBody String body);

    /**
     * 获取数据库中包含的页面和/或数据库列表，并根据请求中提供的过滤条件和排序标准进行过滤和排序。响应可能包含少于 page_size 的结果。如果响应包含 next_cursor 值，请参阅分页参考，了解如何使用游标遍历列表。<br>
     * 过滤器与 Notion 用户界面中提供的过滤器类似，用户界面中通过 "And"（和）链式连接的过滤器和过滤器组相当于在 "and" 复合过滤器的数组中包含每个过滤器。类似地，用户界面中以 "Or "为链的一组过滤器将表示为 "or" 复合过滤器数组中的过滤器。<br>
     * 过滤器可对数据库属性进行操作，并可组合使用。如果没有提供过滤器，数据库中的所有页面都将以分页方式返回。除了链式过滤器外，还可以使用单个过滤器查询数据库。<br>
     * 排序与 Notion UI 中提供的排序类似。排序根据数据库属性或页面时间戳进行操作，并可进行组合。请求中的排序顺序很重要，较早的排序优先于较晚的排序。可以使用 filter_properties 查询参数过滤响应正文中返回的数据库模式属性。
     * 通过连锁 filter_properties 查询参数，可以提供多个过滤器属性。
     *
     * @param databaseId 数据库id
     * @param body       查询参数
     * @return 数据库信息
     */
    @PostExchange("{databaseId}/query")
    ResponseEntity<QueryDatabaseDto> queryDatabase(@PathVariable String databaseId, @RequestBody String body);

    /**
     * 为提供的数据库 ID 检索数据库对象（描述数据库结构和列的信息）。响应符合集成功能的任何限制。
     *
     * @param databaseId 数据库id
     * @return 数据库信息
     */
    @GetExchange("{databaseId}")
    ResponseEntity<Database> retrieveDatabase(@PathVariable String databaseId);

    /**
     * 更新指定数据库的数据库对象（标题、说明或属性）。
     *
     * @param dataBaseId 数据库id
     * @param body       数据库更新内容
     * @return 数据库信息
     */
    @PatchExchange("{dataBaseId}")
    ResponseEntity<Database> updateDatabase(@PathVariable String dataBaseId, @RequestBody String body);

}
