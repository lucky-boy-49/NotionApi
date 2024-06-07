package com.lucky.notionapi.mapper;

import com.lucky.notionapi.dao.SearchDao;
import com.lucky.notionapi.dto.SearchDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

/**
 * 搜索服务
 *
 * @author jiahe
 */
@HttpExchange("/v1/search")
public interface NotionSearchService {

    @PostExchange
    ResponseEntity<SearchDto> searchByTitle(@RequestBody SearchDao body);

}
