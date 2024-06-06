package com.lucky.notionapi.dao.propertyitem;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.config.NotionConfig;
import com.lucky.notionapi.dao.PropertyItemDao;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

/**
 * 分页属性值<br>
 * 属性中的 title 、 rich_text 、 relation 和 people 属性项将以分页的 list 对象形式返回，其中包含单个 property_item 对象。
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaginatedProperty implements PropertyItemDao {

    /**
     * 总是 "list" 。
     */
    private String object = "list";

    /**
     * 总是 "property_item" 。
     */
    private String type = "property_item";

    /**
     * property_item 对象列表。
     */
    @Valid
    private List<PropertyItem> results;

    /**
     * 描述属性的 property_item 对象。
     */
    @Valid
    @JsonProperty("property_item")
    private PropertyItem propertyItem;

    /**
     * 用户可以请求获取下一页结果的 URL。
     */
    @JsonProperty("next_url")
    @Size(max = NotionConfig.ANY_URL_SIZE, message = NotionConfig.ANY_URL_MESSAGE)
    private String nextUrl;

    /**
     * 用户可以请求获取下一页结果的 cursor 。
     * 如果没有更多结果，则为 null 。
     */
    @JsonProperty("next_cursor")
    private String nextCursor;

    /**
     * 如果还有更多，则为 true 。
     * 如果没有更多，则为 null 。
     */
    @JsonProperty("has_more")
    private Boolean hasMore;

}
