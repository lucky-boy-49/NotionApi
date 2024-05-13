package com.lucky.notionapi.model.page.properties.type;

import com.lucky.notionapi.model.page.properties.AbstractProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * URL
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class URLProperties extends AbstractProperties {

    /**
     * 描述网址的字符串。
     */
    private String url;

}
