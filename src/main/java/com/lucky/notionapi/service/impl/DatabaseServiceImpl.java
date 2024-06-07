package com.lucky.notionapi.service.impl;

import com.lucky.notionapi.annotation.Notion;
import com.lucky.notionapi.dao.DatabaseDao;
import com.lucky.notionapi.dao.QueryDatabaseDao;
import com.lucky.notionapi.dao.UpdateDatabaseDao;
import com.lucky.notionapi.dto.QueryDatabaseDto;
import com.lucky.notionapi.mapper.NotionDatabaseService;
import com.lucky.notionapi.model.database.Database;
import com.lucky.notionapi.service.DatabaseService;
import com.lucky.notionapi.util.ObjectMapperUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

/**
 * 数据库服务
 *
 * @author jiahe
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class DatabaseServiceImpl implements DatabaseService {

    private final HttpServiceProxyFactory factory;

    /**
     * 创建数据库
     *
     * @param body 数据库信息
     * @return 数据库信息
     */
    @Override
    @Notion("创建数据库")
    public Database createDatabase(DatabaseDao body) {
        NotionDatabaseService client = factory.createClient(NotionDatabaseService.class);
        String bodyJson = ObjectMapperUtils.toJson(body);
        ResponseEntity<Database> response = client.createDatabase(bodyJson);
        return response.getBody();
    }

    /**
     * 查询数据库
     *
     * @param databaseId 数据库id
     * @param body       查询条件
     * @return 数据库信息
     */
    @Override
    @Notion("查询数据库")
    public QueryDatabaseDto queryDatabase(String databaseId, QueryDatabaseDao body) {
        NotionDatabaseService client = factory.createClient(NotionDatabaseService.class);
        String bodyJson = ObjectMapperUtils.toJson(body);
        ResponseEntity<QueryDatabaseDto> response = client.queryDatabase(databaseId, bodyJson);
        return response.getBody();
    }

    /**
     * 检索数据库
     *
     * @param databaseId 数据库id
     * @return 数据库信息
     */
    @Override
    @Notion("检索数据库")
    public Database retrieveDatabase(String databaseId) {
        NotionDatabaseService client = factory.createClient(NotionDatabaseService.class);
        ResponseEntity<Database> response = client.retrieveDatabase(databaseId);
        return response.getBody();
    }

    @Override
    @Notion("更新数据库")
    public Database updateDatabase(String databaseId, UpdateDatabaseDao body) {
        NotionDatabaseService client = factory.createClient(NotionDatabaseService.class);
        String bodyJson = ObjectMapperUtils.toJson(body);
        ResponseEntity<Database> response = client.updateDatabase(databaseId, bodyJson);
        return response.getBody();
    }

}
