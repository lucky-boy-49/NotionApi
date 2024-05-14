package com.lucky.notionapi.model.database.properties.type;

import com.lucky.notionapi.model.database.properties.AbstractDatabaseProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * URL
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class URLDatabaseProperties extends AbstractDatabaseProperties {

    /**
     * 描述网址的字符串。
     */
    private String url;

}
