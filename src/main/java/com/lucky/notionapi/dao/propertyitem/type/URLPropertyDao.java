package com.lucky.notionapi.dao.propertyitem.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.config.NotionConfig;
import com.lucky.notionapi.dao.propertyitem.AbstractPropertyItem;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * URL 属性值<br>
 * URL 属性值对象的 url 属性中包含一个非空字符串。该字符串描述了一个网址。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class URLPropertyDao extends AbstractPropertyItem {

    @Size(max = NotionConfig.ANY_URL_SIZE, message = NotionConfig.ANY_URL_MESSAGE)
    private String url;

}
