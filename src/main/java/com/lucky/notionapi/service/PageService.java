package com.lucky.notionapi.service;

import com.lucky.notionapi.dao.PropertyItemDao;
import com.lucky.notionapi.dao.UpdatePagePropertyRequestDao;
import com.lucky.notionapi.model.page.Page;
import jakarta.annotation.Nullable;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

import java.util.Map;

/**
 * 页服务
 * @author jiahe
 */
@Validated
public interface PageService {

    @Validated
    Page createPage(@Valid Page page);

    @Validated
    Page queryPage(@NotNull String pageId, @Nullable String[] filters);

    @Validated
    PropertyItemDao retrievePagePropertyItem(@NotNull String pageId, @NotNull String propertyId,
                                             @Nullable Map<String, String> params);

    @Validated
    Page updatePageProperty(@NotNull String pageId, @Valid UpdatePagePropertyRequestDao requestDao);

}
