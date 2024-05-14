package com.lucky.notionapi.model.page.properties.type;

import com.lucky.notionapi.model.page.properties.AbstractPageProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 邮箱
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class EmailPageProperties extends AbstractPageProperties {

    private String email;

}
