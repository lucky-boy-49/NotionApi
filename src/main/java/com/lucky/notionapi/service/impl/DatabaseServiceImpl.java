package com.lucky.notionapi.service.impl;

import com.lucky.notionapi.annotation.NotionException;
import com.lucky.notionapi.dao.DatabaseDao;
import com.lucky.notionapi.model.database.Database;
import com.lucky.notionapi.service.DatabaseService;
import com.lucky.notionapi.utils.ObjectMapperUtil;
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
public class DatabaseServiceImpl {

    private final HttpServiceProxyFactory factory;

    @NotionException("创建数据库")
    public Database createDatabase(DatabaseDao body) {
        DatabaseService client = factory.createClient(DatabaseService.class);
        ResponseEntity<Database> response = client.createDatabase(ObjectMapperUtil.toJson(body));
        return response.getBody();
    }

}
