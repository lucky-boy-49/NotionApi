package com.lucky.notionapi.model.page.properties.type;

import com.lucky.notionapi.model.page.properties.AbstractPageProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * URL
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class URLPageProperties extends AbstractPageProperties {

    /**
     * 描述网址的字符串。
     */
    private String url;

}
