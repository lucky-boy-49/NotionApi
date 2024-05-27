package com.lucky.notionapi.dao.propertyitem;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 属性项对象的抽象类<br>
 * 包含object、id、类型
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class AbstractPropertyItem implements PropertyItem {

    /**
     * 始终 "property_item" 。
     */
    protected String object = "property_item";

    /**
     * 属性的基础标识符。当属性名称更改时，该标识符保证保持不变。它可能是一个 UUID，但通常是一个短的随机字符串。<br>
     * 创建或更新页面时，可以使用 id 代替 name 。
     */
    protected String id;

    /**
     * 属性的类型。可能的值:{@link PropertyItem}
     */
    protected String type;

    @JsonProperty("next_url")
    protected String nextUrl;

}
