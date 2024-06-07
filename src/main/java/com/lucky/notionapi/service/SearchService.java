package com.lucky.notionapi.service;

import com.lucky.notionapi.dao.SearchDao;
import com.lucky.notionapi.dto.SearchDto;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

/**
 * 搜索服务
 * @author jiahe
 */
@Validated
public interface SearchService {

    @Validated
    SearchDto searchByTitle(@Valid SearchDao body);

}
