package com.lucky.notionapi.model.page.properties;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.lucky.notionapi.model.page.properties.type.*;

import static com.lucky.notionapi.model.page.properties.PageProperties.*;

/**
 * 页属性接口
 *
 * @author 贺佳
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, include = JsonTypeInfo.As.EXISTING_PROPERTY)
@JsonSubTypes({
        @JsonSubTypes.Type(value = CheckboxPageProperties.class, name = CHECKBOX),
        @JsonSubTypes.Type(value = CreatedByPageProperties.class, name = CREATED_BY),
        @JsonSubTypes.Type(value = CreatedTimePageProperties.class, name = CREATED_TIME),
        @JsonSubTypes.Type(value = DatePageProperties.class, name = DATE),
        @JsonSubTypes.Type(value = EmailPageProperties.class, name = EMAIL),
        @JsonSubTypes.Type(value = FilePageProperties.class, name = FILES),
        @JsonSubTypes.Type(value = FormulaPageProperties.class, name = FORMULA),
        @JsonSubTypes.Type(value = LastEditedByPageProperties.class, name = LAST_EDITED_BY),
        @JsonSubTypes.Type(value = LastEditedTimePageProperties.class, name = LAST_EDITED_TIME),
        @JsonSubTypes.Type(value = MultiSelectPageProperties.class, name = MULTI_SELECT),
        @JsonSubTypes.Type(value = NumberPageProperties.class, name = NUMBER),
        @JsonSubTypes.Type(value = PeoplePageProperties.class, name = PEOPLE),
        @JsonSubTypes.Type(value = PhoneNumberPageProperties.class, name = PHONE_NUMBER),
        @JsonSubTypes.Type(value = RelationPageProperties.class, name = RELATION),
        @JsonSubTypes.Type(value = RollupPageProperties.class, name = ROLLUP),
        @JsonSubTypes.Type(value = RichTextPageProperties.class, name = RICH_TEXT),
        @JsonSubTypes.Type(value = SelectPageProperties.class, name = SELECT),
        @JsonSubTypes.Type(value = StatusPageProperties.class, name = STATUS),
        @JsonSubTypes.Type(value = TitlePageProperties.class, name = TITLE),
        @JsonSubTypes.Type(value = URLPageProperties.class, name = URL),
        @JsonSubTypes.Type(value = UniqueIDPageProperties.class, name = UNIQUE_ID),
        @JsonSubTypes.Type(value = VerificationPageProperties.class, name = VERIFICATION)
})
public interface PageProperties {

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
    /**
     * 唯一id
     */
    String UNIQUE_ID = "unique_id";
    /**
     * 认证
     */
    String VERIFICATION = "verification";

}
