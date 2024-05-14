package com.lucky.notionapi.model.database.properties.type;

import com.lucky.notionapi.model.database.properties.AbstractDatabaseProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 日期数据库属性在 Notion UI 中呈现为包含日期值的列。date 类型对象为空；没有额外的配置。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DateDatabaseProperties extends AbstractDatabaseProperties {

    private Date date;

    @Data
    static class Date {

    }

}
