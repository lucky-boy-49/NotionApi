package com.lucky.notionapi.util;

import com.lucky.notionapi.dao.DatabaseDao;
import com.lucky.notionapi.enumerate.NumberFormatEnum;
import com.lucky.notionapi.model.communal.*;
import com.lucky.notionapi.model.communal.richtext.RichTextType;
import com.lucky.notionapi.model.communal.richtext.type.TextRichText;
import com.lucky.notionapi.model.database.properties.DatabaseProperties;
import com.lucky.notionapi.model.database.properties.type.*;
import com.lucky.notionapi.model.file.FileFile;
import com.lucky.notionapi.model.file.FileType;
import com.lucky.notionapi.model.parent.Parent;
import com.lucky.notionapi.model.user.type.People;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 数据库工具类
 *
 * @author jiahe
 */
public class DatabaseUtils {

    /**
     * 创建数据库DAO对象，创建数据库时发送请求的参数
     *
     * @param parent     父级对象
     * @param title      数据库名称
     * @param properties 数据库属性
     * @param icon       数据库图标
     * @param cover      数据库封面
     * @return 数据库DAO对象
     */
    public static DatabaseDao creatDatabaseDao(Parent parent, RichTextType[] title, List<DatabaseProperties> properties,
                                               FileType icon, FileType cover) {
        return new DatabaseDao(parent, title, icon, cover, properties);
    }

    /**
     * 创建数据库DAO对象，创建数据库时发送请求的参数
     *
     * @param parent     父级对象
     * @param title      数据库名称
     * @param properties 数据库属性
     * @return 数据库DAO对象
     */
    public static DatabaseDao creatDatabaseDao(Parent parent, RichTextType[] title, List<DatabaseProperties> properties) {
        return creatDatabaseDao(parent, title, properties, null, null);
    }

    /**
     * 创建数据库复选框属性
     *
     * @param name 自定义属性名称
     * @return 数据库复选框属性
     */
    public static CheckboxDatabaseProperties creatCheckboxDatabaseProperties(String name) {
        CheckboxDatabaseProperties res = new CheckboxDatabaseProperties();
        res.setCheckbox(new Checkbox());
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建数据库创建者属性
     *
     * @param name 自定义属性名称
     * @return 数据库创建者属性
     */
    public static CreatedByDatabaseProperties creatCreatedByDatabaseProperties(String name) {
        CreatedByDatabaseProperties res = new CreatedByDatabaseProperties();
        res.setCreatedBy(new CreatedBy());
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建数据库创建时间属性
     *
     * @param name 自定义属性名称
     * @return 数据库创建时间属性
     */
    public static CreatedTimeDatabaseProperties creatCreatedTimeDatabaseProperties(String name) {
        CreatedTimeDatabaseProperties res = new CreatedTimeDatabaseProperties();
        res.setCreatedTime(new CreatedTime());
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建数据库日期属性
     *
     * @param name 自定义属性名称
     * @return 数据库日期属性
     */
    public static DateDatabaseProperties creatDateDatabaseProperties(String name) {
        DateDatabaseProperties res = new DateDatabaseProperties();
        res.setDate(new Date());
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建数据库双属性关系属性
     *
     * @param name       自定义属性名称
     * @param databaseId 绑定的数据库ID
     * @return 数据库双属性关系属性
     */
    public static DualPropertyRelationDatabaseProperties creatDualPropertyRelationDatabaseProperties(String name,
                                                                                                     String databaseId) {
        DualPropertyRelationDatabaseProperties res = new DualPropertyRelationDatabaseProperties();
        res.setDualProperty(new DualPropertyRelationDatabaseProperties.DualProperty());
        res.setDatabaseId(databaseId);
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建数据库电子邮件属性
     *
     * @param name 自定义属性名称
     * @return 数据库电子邮件属性
     */
    public static EmailDatabaseProperties creatEmailDatabaseProperties(String name) {
        EmailDatabaseProperties res = new EmailDatabaseProperties();
        res.setEmail(new Email());
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建数据库文件属性
     *
     * @param name 自定义属性名称
     * @return 数据库文件属性
     */
    public static FilesDatabaseProperties creatFilesDatabaseProperties(String name) {
        FilesDatabaseProperties res = new FilesDatabaseProperties();
        res.setFiles(new FileFile());
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建数据库公式属性
     *
     * @param name       自定义属性名称
     * @param expression 公式表达式
     * @return 数据库公式属性
     */
    public static FormulaDatabaseProperties creatFormulaDatabaseProperties(String name, String expression) {
        FormulaDatabaseProperties res = new FormulaDatabaseProperties();
        res.setFormula(new Formula());
        res.getFormula().setExpression(expression);
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建数据库最后编辑者属性
     *
     * @param name 自定义属性名称
     * @return 数据库最后编辑者属性
     */
    public static LastEditedByDatabaseProperties creatLastEditedByDatabaseProperties(String name) {
        LastEditedByDatabaseProperties res = new LastEditedByDatabaseProperties();
        res.setLastEditedBy(new People());
        res.setCustomizeName(name);
        return res;
    }


    /**
     * 创建数据库最后编辑时间属性
     *
     * @param name 自定义属性名称
     * @return 数据库最后编辑时间属性
     */
    public static LastEditedTimeDatabaseProperties creatLastEditedTimeDatabaseProperties(String name) {
        LastEditedTimeDatabaseProperties res = new LastEditedTimeDatabaseProperties();
        res.setLastEditedTime(new LastEditedTime());
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建数据库多选属性
     *
     * @param name    自定义属性名称
     * @param options 选项
     * @return 数据库多选属性
     */
    public static MultiSelectDatabaseProperties creatMultiSelectDatabaseProperties(String name, Option[] options) {
        MultiSelectDatabaseProperties res = new MultiSelectDatabaseProperties();
        res.setMultiSelect(new MultiSelect(options));
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建数据库数字属性
     *
     * @param name   自定义属性名称
     * @param format 数字格式 {@link NumberFormatEnum}
     * @return 数据库数字属性
     */
    public static NumberDatabaseProperties creatNumberDatabaseProperties(String name, String format) {
        NumberDatabaseProperties res = new NumberDatabaseProperties();
        res.setNumber(new NumberFormat(format));
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建数据库人员属性
     *
     * @param name 自定义属性名称
     * @return 数据库人员属性
     */
    public static PeopleDatabaseProperties creatPeopleDatabaseProperties(String name) {
        PeopleDatabaseProperties res = new PeopleDatabaseProperties();
        res.setPeople(new People());
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建数据库电话号码属性
     *
     * @param name 自定义属性名称
     * @return 数据库电话号码属性
     */
    public static PhoneNumberDatabaseProperties creatPhoneNumberDatabaseProperties(String name) {
        PhoneNumberDatabaseProperties res = new PhoneNumberDatabaseProperties();
        res.setPhoneNumber(new PhoneNumber());
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建数据库单向关系属性
     *
     * @param name       自定义属性名称
     * @param databaseId 绑定的数据库ID
     * @return 数据库单向关系属性
     */
    public static SinglePropertyRelationDatabaseProperties creatSinglePropertyRelationDatabaseProperties(String name,
                                                                                                         String databaseId) {
        SinglePropertyRelationDatabaseProperties res = new SinglePropertyRelationDatabaseProperties();
        res.setSingleProperty(new SinglePropertyRelationDatabaseProperties.SingleProperty());
        res.setDatabaseId(databaseId);
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建数据库文本属性
     *
     * @param name 自定义属性名称
     * @return 数据库文本属性
     */
    public static RichTextDatabaseProperties creatRichTextDatabaseProperties(String name) {
        RichTextDatabaseProperties res = new RichTextDatabaseProperties();
        res.setRichText(new TextRichText());
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建数据库汇总属性
     *
     * @param name                 自定义属性名称
     * @param function             汇总函数
     * @param relationPropertyId   关联属性ID(ID、名称必须有一个)，
     * @param relationPropertyName 关联属性名称
     * @param rollupPropertyId     汇总属性ID(ID、名称必须有一个)，关联属性关联的数据库下的属性ID
     * @param rollupPropertyName   汇总属性名称，关联属性关联的数据库下的属性名称
     * @return 数据库汇总属性
     */
    public static RollupDatabaseProperties creatRollupDatabaseProperties(String name, String function, String relationPropertyId,
                                                                         String relationPropertyName, String rollupPropertyId,
                                                                         String rollupPropertyName) {
        RollupDatabaseProperties res = new RollupDatabaseProperties();
        res.setRollup(new Rollup(function, relationPropertyId, relationPropertyName, rollupPropertyId, rollupPropertyName));
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建数据库单选属性
     *
     * @param name    自定义属性名称
     * @param options 选项
     * @return 数据库单选属性
     */
    public static SelectDatabaseProperties creatSelectDatabaseProperties(String name, Option[] options) {
        SelectDatabaseProperties res = new SelectDatabaseProperties();
        res.setSelect(new Select(options));
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建数据库标题属性
     *
     * @param name 自定义属性名称
     * @return 数据库标题属性
     */
    public static TitleDatabaseProperties creatTitleDatabaseProperties(String name) {
        TitleDatabaseProperties res = new TitleDatabaseProperties();
        res.setTitle(new TextRichText());
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建数据库URL属性
     *
     * @param name 自定义属性名称
     * @return 数据库URL属性
     */
    public static URLDatabaseProperties creatUrlDatabaseProperties(String name) {
        URLDatabaseProperties res = new URLDatabaseProperties();
        res.setUrl(new URL());
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建数据库属性集合<br>
     *
     * @param properties 属性集合，集合{@code Key}为自定义属性名称，{@code Value}为属性类型（只支持{@link DatabaseProperties#CHECKBOX}、
     *                   {@link DatabaseProperties#CREATED_BY}、{@link DatabaseProperties#CREATED_TIME}、{@link DatabaseProperties#DATE}、
     *                   {@link DatabaseProperties#EMAIL}、{@link DatabaseProperties#FILES}、{@link DatabaseProperties#LAST_EDITED_BY}、
     *                   {@link DatabaseProperties#LAST_EDITED_TIME}、{@link DatabaseProperties#PEOPLE}、{@link DatabaseProperties#PHONE_NUMBER}、
     *                   {@link DatabaseProperties#RICH_TEXT}、{@link DatabaseProperties#TITLE}、{@link DatabaseProperties#URL}，
     *                   其他数据库属性类型不会进行创建返回）
     * @return 数据库属性集合，可能返回空
     */
    public static List<DatabaseProperties> creatDatabaseProperties(Map<String, String> properties) {
        List<DatabaseProperties> res = new LinkedList<>();
        if (properties == null) {
            return res;
        }
        properties.forEach((k, v) -> {
            switch (v) {
                case DatabaseProperties.CHECKBOX -> res.add(creatCheckboxDatabaseProperties(k));
                case DatabaseProperties.CREATED_BY -> res.add(creatCreatedByDatabaseProperties(k));
                case DatabaseProperties.CREATED_TIME -> res.add(creatCreatedTimeDatabaseProperties(k));
                case DatabaseProperties.DATE -> res.add(creatDateDatabaseProperties(k));
                case DatabaseProperties.EMAIL -> res.add(creatEmailDatabaseProperties(k));
                case DatabaseProperties.FILES -> res.add(creatFilesDatabaseProperties(k));
                case DatabaseProperties.LAST_EDITED_BY -> res.add(creatLastEditedByDatabaseProperties(k));
                case DatabaseProperties.LAST_EDITED_TIME -> res.add(creatLastEditedTimeDatabaseProperties(k));
                case DatabaseProperties.PEOPLE -> res.add(creatPeopleDatabaseProperties(k));
                case DatabaseProperties.PHONE_NUMBER -> res.add(creatPhoneNumberDatabaseProperties(k));
                case DatabaseProperties.RICH_TEXT -> res.add(creatRichTextDatabaseProperties(k));
                case DatabaseProperties.TITLE -> res.add(creatTitleDatabaseProperties(k));
                case DatabaseProperties.URL -> res.add(creatUrlDatabaseProperties(k));
            }
        });
        return res;
    }

}
