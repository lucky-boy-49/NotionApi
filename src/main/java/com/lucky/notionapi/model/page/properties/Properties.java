package com.lucky.notionapi.model.page.properties;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.lucky.notionapi.model.page.properties.type.*;

import static com.lucky.notionapi.model.page.properties.Properties.*;

/**
 * 页属性接口
 *
 * @author 贺佳
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = CheckboxProperties.class, name = CHECKBOX),
        @JsonSubTypes.Type(value = CreatedByProperties.class, name = CREATED_BY),
        @JsonSubTypes.Type(value = CreatedByProperties.class, name = CREATED_TIME),
        @JsonSubTypes.Type(value = DateProperties.class, name = DATE),
        @JsonSubTypes.Type(value = EmailProperties.class, name = EMAIL),
        @JsonSubTypes.Type(value = FileProperties.class, name = FILES),
        @JsonSubTypes.Type(value = FormulaProperties.class, name = FORMULA),
        @JsonSubTypes.Type(value = LastEditedByProperties.class, name = LAST_EDITED_BY),
        @JsonSubTypes.Type(value = LastEditedTimeProperties.class, name = LAST_EDITED_TIME),
        @JsonSubTypes.Type(value = MultiSelectProperties.class, name = MULTI_SELECT),
        @JsonSubTypes.Type(value = NumberProperties.class, name = NUMBER),
        @JsonSubTypes.Type(value = PeopleProperties.class, name = PEOPLE),
        @JsonSubTypes.Type(value = PhoneNumberProperties.class, name = PHONE_NUMBER),
        @JsonSubTypes.Type(value = RelationProperties.class, name = RELATION),
        @JsonSubTypes.Type(value = RollupProperties.class, name = ROLLUP),
        @JsonSubTypes.Type(value = RichTextProperties.class, name = RICH_TEXT),
        @JsonSubTypes.Type(value = SelectProperties.class, name = SELECT),
        @JsonSubTypes.Type(value = StatusProperties.class, name = STATUS),
        @JsonSubTypes.Type(value = TitleProperties.class, name = TITLE),
        @JsonSubTypes.Type(value = URLProperties.class, name = URL),
        @JsonSubTypes.Type(value = UniqueIDProperties.class, name = UNIQUE_ID),
        @JsonSubTypes.Type(value = VerificationProperties.class, name = VERIFICATION)
})
public interface Properties {

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
