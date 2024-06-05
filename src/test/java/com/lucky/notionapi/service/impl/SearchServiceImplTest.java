package com.lucky.notionapi.service.impl;

import com.lucky.notionapi.NotionClient;
import com.lucky.notionapi.dao.SearchDao;
import com.lucky.notionapi.dto.SearchDto;
import com.lucky.notionapi.model.database.sort.EntryTimestampSort;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SearchServiceImplTest {

    @Autowired
    private NotionClient client;

    @Test
    void searchByTitle() {
        SearchDao searchDao = new SearchDao();
        searchDao.setQuery("Kindle读书");
        searchDao.setSort(new EntryTimestampSort());
        searchDao.getSort().setDirection("ascending");
        searchDao.getSort().setTimestamp("last_edited_time");
        searchDao.setFilter(new SearchDao.Filter());
        searchDao.getFilter().setProperty("object");
        searchDao.getFilter().setValue("database");
        SearchDto searchDto = client.searchService().searchByTitle(searchDao);
        System.out.println(searchDto);
    }
}