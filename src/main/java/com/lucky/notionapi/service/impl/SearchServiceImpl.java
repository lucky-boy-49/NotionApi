package com.lucky.notionapi.service.impl;

import com.lucky.notionapi.annotation.Notion;
import com.lucky.notionapi.dao.SearchDao;
import com.lucky.notionapi.dto.SearchDto;
import com.lucky.notionapi.service.SearchService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

/**
 * 搜索服务
 *
 * @author jiahe
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class SearchServiceImpl {

    private final HttpServiceProxyFactory factory;

    @Notion("按标题搜索")
    public SearchDto searchByTitle(@Validated SearchDao body) {
        SearchService client = factory.createClient(SearchService.class);
        return client.searchByTitle(body).getBody();
    }

}
