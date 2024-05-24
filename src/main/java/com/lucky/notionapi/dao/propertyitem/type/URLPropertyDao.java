package com.lucky.notionapi.dao.propertyitem.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.dao.propertyitem.AbstractPropertyItem;
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

    private String url;

}
