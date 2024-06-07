package com.lucky.notionapi.service.impl;

import com.lucky.notionapi.annotation.Notion;
import com.lucky.notionapi.dao.PropertyItemDao;
import com.lucky.notionapi.dao.UpdatePagePropertyRequestDao;
import com.lucky.notionapi.mapper.NotionPageService;
import com.lucky.notionapi.model.page.Page;
import com.lucky.notionapi.service.PageService;
import com.lucky.notionapi.utils.ObjectMapperUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import java.util.Map;
import java.util.Objects;

/**
 * 页服务
 *
 * @author jiahe
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class PageServiceImpl implements PageService {

    private final HttpServiceProxyFactory factory;


    /**
     * 创建页面
     *
     * @param page 页面数据
     * @return 页面数据
     */
    @Override
    @Notion("创建页面")
    public Page createPage(Page page) {
        NotionPageService service = factory.createClient(NotionPageService.class);
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
    @Override
    @Notion("检索页面")
    public Page queryPage(String pageId, String[] filters) {
        NotionPageService service = factory.createClient(NotionPageService.class);
        ResponseEntity<Page> response = service.retrievePage(pageId, filters);
        return Objects.requireNonNull(response.getBody());
    }

    /**
     * 获取页面属性项
     *
     * @param pageId     页面id
     * @param propertyId 属性id
     * @param params     分页参数
     * @return 属性项数据
     */
    @Override
    @Notion("获取页面属性项")
    public PropertyItemDao retrievePagePropertyItem(String pageId, String propertyId, Map<String, String> params) {
        if (params == null) {
            params = Map.of();
        }
        NotionPageService service = factory.createClient(NotionPageService.class);
        ResponseEntity<PropertyItemDao> response = service.retrievePagePropertyItem(pageId, propertyId, params);
        return Objects.requireNonNull(response.getBody());
    }

    /**
     * 更新页面属性<br>
     * <p><b>注意：</b> 也可以用于删除页面（非永久删除），通过 API 删除页面，发送更新页面请求，并将 in_trash 主体参数设置为 true 。
     * 要恢复页面，请将 in_trash 设置为 false 。</p>
     *
     * @param pageId     页面id
     * @param requestDao 修改数据
     * @return 页面数据
     */
    @Override
    @Notion("更新页面属性")
    public Page updatePageProperty(String pageId, UpdatePagePropertyRequestDao requestDao) {
        String body = ObjectMapperUtil.toJson(requestDao);
        NotionPageService service = factory.createClient(NotionPageService.class);
        ResponseEntity<Page> response = service.updatePageProperties(pageId, body);
        return Objects.requireNonNull(response.getBody());
    }

}
