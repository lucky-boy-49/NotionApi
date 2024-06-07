package com.lucky.notionapi.model.database.properties;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.lucky.notionapi.model.database.properties.type.*;
import org.springframework.validation.annotation.Validated;

import static com.lucky.notionapi.model.database.properties.DatabaseProperties.*;

/**
 * 数据库属性接口
 *
 * @author jiahe
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, include = JsonTypeInfo.As.EXISTING_PROPERTY)
@JsonSubTypes({
        @Type(value = CheckboxDatabaseProperties.class, name = CHECKBOX),
        @Type(value = CreatedByDatabaseProperties.class, name = CREATED_BY),
        @Type(value = CreatedTimeDatabaseProperties.class, name = CREATED_TIME),
        @Type(value = DateDatabaseProperties.class, name = DATE),
        @Type(value = EmailDatabaseProperties.class, name = EMAIL),
        @Type(value = FilesDatabaseProperties.class, name = FILES),
        @Type(value = FormulaDatabaseProperties.class, name = FORMULA),
        @Type(value = LastEditedByDatabaseProperties.class, name = LAST_EDITED_BY),
        @Type(value = LastEditedTimeDatabaseProperties.class, name = LAST_EDITED_TIME),
        @Type(value = MultiSelectDatabaseProperties.class, name = MULTI_SELECT),
        @Type(value = NumberDatabaseProperties.class, name = NUMBER),
        @Type(value = PeopleDatabaseProperties.class, name = PEOPLE),
        @Type(value = PhoneNumberDatabaseProperties.class, name = PHONE_NUMBER),
        @Type(value = RelationDatabaseProperties.class, name = RELATION),
        @Type(value = RichTextDatabaseProperties.class, name = RICH_TEXT),
        @Type(value = RollupDatabaseProperties.class, name = ROLLUP),
        @Type(value = SelectDatabaseProperties.class, name = SELECT),
        @Type(value = StatusDatabaseProperties.class, name = STATUS),
        @Type(value = TitleDatabaseProperties.class, name = TITLE),
        @Type(value = URLDatabaseProperties.class, name = URL),
        @Type(value = SinglePropertyRelationDatabaseProperties.class, name = SINGLE_PROPERTY),
        @Type(value = DualPropertyRelationDatabaseProperties.class, name = DUAL_PROPERTY),
})
@Validated
public interface DatabaseProperties {

    /**
     * 复选框
     */
    String CHECKBOX = "checkbox";
    /**
     * 由...创建
     */
    String CREATED_BY = "created_by";
    /**
     * 创建时间
     */
    String CREATED_TIME = "created_time";
    /**
     * 日期
     */
    String DATE = "date";
    /**
     * 电子邮件
     */
    String EMAIL = "email";
    /**
     * 文件
     */
    String FILES = "files";
    /**
     * 公式
     */
    String FORMULA = "formula";
    /**
     * 最后编辑者
     */
    String LAST_EDITED_BY = "last_edited_by";
    /**
     * 最后编辑时间
     */
    String LAST_EDITED_TIME = "last_edited_time";
    /**
     * 多选
     */
    String MULTI_SELECT = "multi_select";
    /**
     * 数字
     */
    String NUMBER = "number";
    /**
     * 人
     */
    String PEOPLE = "people";
    /**
     * 电话号码
     */
    String PHONE_NUMBER = "phone_number";
    /**
     * 关系
     */
    String RELATION = "relation";
    /**
     * 汇总
     */
    String ROLLUP = "rollup";
    /**
     * 富文本
     */
    String RICH_TEXT = "rich_text";
    /**
     * 选择
     */
    String SELECT = "select";
    /**
     * 状态
     */
    String STATUS = "status";
    /**
     * 标题
     */
    String TITLE = "title";
    /**
     * URL
     */
    String URL = "url";

    String SINGLE_PROPERTY = "single_property";

    String DUAL_PROPERTY = "dual_property";

}
