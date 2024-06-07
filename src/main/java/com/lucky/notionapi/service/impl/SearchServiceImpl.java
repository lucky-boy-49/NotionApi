package com.lucky.notionapi.service.impl;

import com.lucky.notionapi.annotation.Notion;
import com.lucky.notionapi.dao.SearchDao;
import com.lucky.notionapi.dto.SearchDto;
import com.lucky.notionapi.mapper.NotionSearchService;
import com.lucky.notionapi.service.SearchService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

/**
 * 搜索服务
 *
 * @author jiahe
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class SearchServiceImpl implements SearchService {

    private final HttpServiceProxyFactory factory;

    @Override
    @Notion("按标题搜索")
    public SearchDto searchByTitle(SearchDao body) {
        NotionSearchService client = factory.createClient(NotionSearchService.class);
        return client.searchByTitle(body).getBody();
    }

}
