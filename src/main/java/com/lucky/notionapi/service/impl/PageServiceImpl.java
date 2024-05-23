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


    /**
     * 创建页面
     *
     * @param page 页面数据
     * @return 页面数据
     */
    @NotionException("创建页面")
    public Page createPage(Page page) {
        PageService service = factory.createClient(PageService.class);
        ResponseEntity<Page> response = service.createPage(ObjectMapperUtil.toJson(page));
        return Objects.requireNonNull(response.getBody());
    }

    /**
     * 检索页面
     *
     * @param pageId  页面id
     * @param filters 过滤条件
     * @return 页面数据
     */
    @NotionException("检索页面")
    public Page queryPage(String pageId, String[] filters) {
        PageService service = factory.createClient(PageService.class);
        ResponseEntity<Page> response = service.retrievePage(pageId, filters);
        return Objects.requireNonNull(response.getBody());
    }

}
