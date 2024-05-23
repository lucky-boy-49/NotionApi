package com.lucky.notionapi.service.impl;

import com.lucky.notionapi.annotation.NotionException;
import com.lucky.notionapi.model.page.Page;
import com.lucky.notionapi.service.PageService;
import com.lucky.notionapi.utils.ObjectMapperUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import java.util.Objects;

/**
 * 页服务
 *
 * @author jiahe
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class PageServiceImpl {

    private final HttpServiceProxyFactory factory;


    @NotionException("创建页面")
    public Page createPage(Page page) {
        PageService service = factory.createClient(PageService.class);
        ResponseEntity<Page> response = service.createPage(ObjectMapperUtil.toJson(page));
        return Objects.requireNonNull(response.getBody());
    }

}
