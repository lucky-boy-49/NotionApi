package com.lucky.notionapi.util;

import com.lucky.notionapi.model.block.BlockType;
import com.lucky.notionapi.model.communal.Date;
import com.lucky.notionapi.model.communal.Option;
import com.lucky.notionapi.model.communal.Relation;
import com.lucky.notionapi.model.communal.richtext.RichTextType;
import com.lucky.notionapi.model.file.ExternalFile;
import com.lucky.notionapi.model.file.FileType;
import com.lucky.notionapi.model.page.Page;
import com.lucky.notionapi.model.page.properties.PageProperties;
import com.lucky.notionapi.model.page.properties.type.*;
import com.lucky.notionapi.model.parent.Parent;
import com.lucky.notionapi.model.user.User;

import java.util.List;

/**
 * 页面工具类
 *
 * @author jiahe
 */
public class PageUtils {

    /**
     * 创建页面
     *
     * @param parent     页面父级
     * @param properties 页面属性
     * @param children   页面内容
     * @param icon       页面图标，文件对象（目前仅支持 "external"类型）或Emoji对象
     * @param cover      页面封面，文件对象（目前仅支持 "external"）
     * @return 页面
     */
    public static Page creatPage(Parent parent, List<PageProperties> properties, BlockType[] children, FileType icon, ExternalFile cover) {
        Page res = new Page();
        res.setParent(parent);
        res.setProperties(properties);
        res.setChildren(children);
        res.setIcon(icon);
        res.setCover(cover);
        return res;
    }

    /**
     * 创建页面复选框属性，创建或更新时使用
     *
     * @param name  自定义属性名称
     * @param value 值
     * @return 页面复选框属性
     */
    public static CheckboxPageProperties creatCheckboxPageProperties(String name, boolean value) {
        CheckboxPageProperties res = new CheckboxPageProperties();
        res.setCheckbox(value);
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建页面日期属性
     *
     * @param name  自定义属性名称
     * @param start 开始时间(ISO 8601 日期和时间)
     * @param end   结束时间(可选)
     */
    public static DatePageProperties creatDatePageProperties(String name, String start, String end) {
        DatePageProperties res = new DatePageProperties();
        res.setDate(new Date(start, end, null));
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建页面邮箱属性
     *
     * @param name  自定义属性名称
     * @param email 邮箱地址
     * @return 页面邮箱属性
     */
    public static EmailPageProperties creatEmailPageProperties(String name, String email) {
        EmailPageProperties res = new EmailPageProperties();
        res.setEmail(email);
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建页面文件属性
     *
     * @param name 自定义属性名称
     * @param file 文件
     * @return 页面文件属性
     */
    public static FilePageProperties creatFilePageProperties(String name, FileType[] file) {
        FilePageProperties res = new FilePageProperties();
        res.setFiles(file);
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建页面多选属性
     *
     * @param name  自定义属性名称
     * @param value 多选值
     * @return 页面多选属性
     */
    public static MultiSelectPageProperties creatMultiSelectPageProperties(String name, Option[] value) {
        MultiSelectPageProperties res = new MultiSelectPageProperties();
        res.setOptions(value);
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建页面数值属性
     *
     * @param name  自定义属性名称
     * @param value 数值
     * @return 页面数值属性
     */
    public static NumberPageProperties creatNumberPageProperties(String name, Number value) {
        NumberPageProperties res = new NumberPageProperties();
        res.setNumber(value);
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建页面人员属性
     *
     * @param name   自定义属性名称
     * @param people 人员
     * @return 页面人员属性
     */
    public static PeoplePageProperties creatPeoplePageProperties(String name, User[] people) {
        PeoplePageProperties res = new PeoplePageProperties();
        res.setPeople(people);
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建页面号码属性
     *
     * @param name        自定义属性名称
     * @param phoneNumber 号码
     * @return 页面号码属性
     */
    public static PhoneNumberPageProperties creatPhoneNumberPageProperties(String name, String phoneNumber) {
        PhoneNumberPageProperties res = new PhoneNumberPageProperties();
        res.setPhoneNumber(phoneNumber);
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建页面关系属性
     *
     * @param name       自定义属性名称
     * @param relationId 数据库页面id
     * @return 页面关系属性
     */
    public static RelationPageProperties creatRelationPageProperties(String name, String[] relationId) {
        RelationPageProperties res = new RelationPageProperties();
        if (relationId != null && relationId.length > 0) {
            Relation[] relations = new Relation[relationId.length];
            for (int i = 0; i < relationId.length; i++) {
                relations[i] = new Relation(relationId[i]);
            }
            res.setRelation(relations);
        }
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建页面富文本属性
     *
     * @param name     自定义属性名称
     * @param richText 富文本
     * @return 页面富文本属性
     */
    public static RichTextPageProperties creatRichTextPageProperties(String name, RichTextType[] richText) {
        RichTextPageProperties res = new RichTextPageProperties();
        res.setRichText(richText);
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建页面单选属性
     *
     * @param name  自定义属性名称
     * @param value 单选值
     * @return 页面单选属性
     */
    public static SelectPageProperties creatSelectPageProperties(String name, String value) {
        SelectPageProperties res = new SelectPageProperties();
        res.setSelect(new Option(value));
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建页面状态属性
     *
     * @param name  自定义属性名称
     * @param value 状态
     * @return 页面状态属性
     */
    public static StatusPageProperties creatStatusPageProperties(String name, String value) {
        StatusPageProperties res = new StatusPageProperties();
        res.setStatus(new Option(value));
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建页面标题属性
     *
     * @param name  自定义属性名称
     * @param title 标题富文本
     * @return 页面标题属性
     */
    public static TitlePageProperties creatTitlePageProperties(String name, RichTextType[] title) {
        TitlePageProperties res = new TitlePageProperties();
        res.setTitle(title);
        res.setCustomizeName(name);
        return res;
    }

    /**
     * 创建页面URL属性
     *
     * @param name 自定义属性名称
     * @param url  链接
     * @return 页面URL属性
     */
    public static URLPageProperties creatUrlPageProperties(String name, String url) {
        URLPageProperties res = new URLPageProperties();
        res.setUrl(url);
        res.setCustomizeName(name);
        return res;
    }

}
