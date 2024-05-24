package com.lucky.notionapi.dao.propertyitem;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.lucky.notionapi.dao.propertyitem.type.*;

import static com.lucky.notionapi.dao.propertyitem.PropertyItem.*;

/**
 * 页属性项接口
 * 描述页面属性的标识符、类型和值。它从检索页面属性项返回
 *
 * @author jiahe
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = TitlePropertyDao.class)
@JsonSubTypes({
        @Type(value = TitlePropertyDao.class, name = TITLE),
        @Type(value = RichTextPropertyDao.class, name = RICH_TEXT),
        @Type(value = NumberPropertyDao.class, name = NUMBER),
        @Type(value = SelectPropertyDao.class, name = SELECT),
        @Type(value = MultiSelectPropertyDao.class, name = MULTI_SELECT),
        @Type(value = DatePropertyDao.class, name = DATE),
        @Type(value = FormulaPropertyDao.class, name = FORMULA),
        @Type(value = RelationPropertyDao.class, name = RELATION),
        @Type(value = RollupPropertyDao.class, name = ROLLUP),
        @Type(value = PeoplePropertyDao.class, name = PEOPLE),
        @Type(value = FilesPropertyDao.class, name = FILES),
        @Type(value = CheckboxPropertyDao.class, name = CHECKBOX),
        @Type(value = URLPropertyDao.class, name = URL),
        @Type(value = EmailPropertyDao.class, name = EMAIL),
        @Type(value = PhoneNumberPropertyDao.class, name = PHONE_NUMBER),
        @Type(value = CreatedTimePropertyDao.class, name = CREATE_TIME),
        @Type(value = CreatedByPropertyDao.class, name = CREATED_BY),
        @Type(value = LastEditedTimePropertyDao.class, name = LAST_EDITED_TIME),
        @Type(value = LastEditedByPropertyDao.class, name = LAST_EDITED_BY),
})
public interface PropertyItem {

    /**
     * 标题属性值
     */
    String TITLE = "title";

    /**
     * 富文本属性值
     */
    String RICH_TEXT = "rich_text";

    /**
     * 数字属性值
     */
    String NUMBER = "number";

    /**
     * 选择属性值
     */
    String SELECT = "select";

    /**
     * 多选选项值
     */
    String MULTI_SELECT = "multi_select";

    /**
     * 日期属性值
     */
    String DATE = "date";

    /**
     * 公式属性值
     */
    String FORMULA = "formula";

    /**
     * 关系属性值
     */
    String RELATION = "relation";

    /**
     * 汇总属性值
     */
    String ROLLUP = "rollup";

    /**
     * 人的财产价值
     */
    String PEOPLE = "people";

    /**
     * 文件属性值
     */
    String FILES = "files";

    /**
     * 复选框属性值
     */
    String CHECKBOX = "checkbox";

    /**
     * URL 属性值
     */
    String URL = "url";

    /**
     * 电子邮件属性值
     */
    String EMAIL = "email";

    /**
     * 电话号码属性值
     */
    String PHONE_NUMBER = "phone_number";

    /**
     * 创建时间属性值
     */
    String CREATE_TIME = "create_time";

    /**
     * 创建者属性值
     */
    String CREATED_BY = "created_by";

    /**
     * 上次编辑时间属性值
     */
    String LAST_EDITED_TIME = "last_edited_time";

    /**
     * 最后编辑者属性值
     */
    String LAST_EDITED_BY = "last_edited_by";

}
