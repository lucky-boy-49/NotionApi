package com.lucky.notionapi.model.database.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.model.communal.Email;
import com.lucky.notionapi.model.database.properties.AbstractDatabaseProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 电子邮件数据库属性在 Notion UI 中表示为包含电子邮件值的列。email 类型对象为空。没有额外的属性配置。
 *
 * @author jiahe
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmailDatabaseProperties extends AbstractDatabaseProperties {

    private Email email;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public EmailDatabaseProperties(Boolean initType) {
        if (initType) {
            type = EMAIL;
        }
    }

}
