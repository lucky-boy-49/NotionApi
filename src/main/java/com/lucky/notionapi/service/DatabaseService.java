package com.lucky.notionapi.service;

import com.lucky.notionapi.dao.DatabaseDao;
import com.lucky.notionapi.dao.QueryDatabaseDao;
import com.lucky.notionapi.dao.UpdateDatabaseDao;
import com.lucky.notionapi.dto.QueryDatabaseDto;
import com.lucky.notionapi.model.database.Database;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * 数据库服务接口
 * @author jiahe
 */
@Validated
public interface DatabaseService {

    @Validated
    Database createDatabase(@Valid DatabaseDao body);

    @Validated
    QueryDatabaseDto queryDatabase(@NotNull String databaseId, @Valid QueryDatabaseDao body);

    @Validated
    Database retrieveDatabase(@NotNull String databaseId);

    @Validated
    Database updateDatabase(@NotNull String databaseId, @Valid UpdateDatabaseDao body);

}
