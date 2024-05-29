package com.lucky.notionapi.service;

import com.lucky.notionapi.model.database.Database;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

/**
 * Notion数据库服务<br>
 * <p>创建数据库、查询数据库、检索数据库、更新数据库、更新数据库属性</p>
 *
 * @author jiahe
 */
@HttpExchange("/v1/databases/")
public interface DatabaseService {

    /**
     * 创建一个数据库，作为指定父页面的子页面，并使用指定的属性模式。目前，新数据库的父页面必须是 Notion 页面或维基数据库。<br>
     *
     * @param body 数据库的内容
     * @return 数据库信息
     */
    @PostExchange
    ResponseEntity<Database> createDatabase(@RequestBody String body);

}
