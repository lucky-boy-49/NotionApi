package com.lucky.notionapi.util;

import com.lucky.notionapi.model.communal.Date;
import com.lucky.notionapi.model.communal.richtext.Annotation;
import com.lucky.notionapi.model.communal.richtext.type.EquationRichText;
import com.lucky.notionapi.model.communal.richtext.type.MentionRichText;
import com.lucky.notionapi.model.communal.richtext.type.TextRichText;
import com.lucky.notionapi.model.communal.richtext.type.mention.DatabaseMention;
import com.lucky.notionapi.model.communal.richtext.type.mention.DateMention;

/**
 * 富文本对象工具类
 *
 * @author jiahe
 */
public class RichTextUtils {

    /**
     * 创建一个没有如何格式的文本形式的富文本对象
     *
     * @param content 内容
     * @return 富文本对象
     */
    public static TextRichText createTextRichText(String content) {
        return new TextRichText(content);
    }

    /**
     * 创建一个带有链接的文本形式的富文本对象
     *
     * @param content 内容
     * @param link    连接
     * @return 富文本对象
     */
    public static TextRichText createTextRichText(String content, String link) {
        TextRichText result = createTextRichText(content);
        result.getText().setLink(new TextRichText.Text.Link(link));
        return result;
    }

    /**
     * 创建一个带有链接和格式的文本形式的富文本对象
     *
     * @param content    内容
     * @param link       连接
     * @param annotation 格式
     * @return 富文本对象
     */
    public static TextRichText createTextRichText(String content, String link, Annotation annotation) {
        TextRichText result = createTextRichText(content, link);
        result.setAnnotations(annotation);
        return result;
    }

    /**
     * 创建一个有格式的文本形式的富文本对象
     *
     * @param content    内容
     * @param annotation 格式
     * @return 富文本对象
     */
    public static TextRichText createTextRichText(String content, Annotation annotation) {
        TextRichText result = createTextRichText(content);
        result.setAnnotations(annotation);
        return result;
    }

    /**
     * 创建一个没有格式的方程富文本对象
     *
     * @param expression 方程
     * @return 富文本对象
     */
    public static EquationRichText createEquationRichText(String expression) {
        EquationRichText result = new EquationRichText(true);
        result.setEquation(new EquationRichText.Equation(expression));
        return result;
    }

    /**
     * 创建一个有格式的方程富文本对象
     *
     * @param expression 方程
     * @param annotation 格式
     * @return 富文本对象
     */
    public static EquationRichText createEquationRichText(String expression, Annotation annotation) {
        EquationRichText result = createEquationRichText(expression);
        result.setAnnotations(annotation);
        return result;
    }

    /**
     * 创建一个没有格式的数据库提及对象
     *
     * @param id 要提及的数据库id
     * @return 数据库提及对象
     */
    public static MentionRichText createDatabaseMentionRichText(String id) {
        MentionRichText mentionRichText = new MentionRichText(true);

        DatabaseMention mention = new DatabaseMention(true);
        mention.setDatabase(new DatabaseMention.Database());
        mention.getDatabase().setId(id);

        mentionRichText.setMention(mention);

        return mentionRichText;
    }

    /**
     * 创建一个有格式的数据库提及对象
     *
     * @param id         要提及的数据库id
     * @param annotation 格式
     * @return 数据库提及对象
     */
    public static MentionRichText createDatabaseMentionRichText(String id, Annotation annotation) {
        MentionRichText mentionRichText = createDatabaseMentionRichText(id);
        mentionRichText.setAnnotations(annotation);
        return mentionRichText;
    }

    /**
     * 创建一个没有格式的日期提及对象
     *
     * @param date 日期提及对象的时间对象，详情查看{@link Date}
     * @return 期提及对象
     */
    public static MentionRichText createDateMentionRichText(Date date) {
        MentionRichText mentionRichText = new MentionRichText(true);

        DateMention dateMention = new DateMention(true);
        dateMention.setDate(date);
        mentionRichText.setMention(dateMention);

        return mentionRichText;
    }

    /**
     * 创建一个没有格式的日期提及对象
     *
     * @param start    提及日期的开始时间（ISO 8601 格式的日期）可以为空
     * @param end      提及日期的结束时间（ISO 8601 格式的日期），可以为空
     * @param timeZone start 和 end 的时区信息
     * @return 数据库提及对象
     */
    public static MentionRichText createDateMentionRichText(String start, String end, String timeZone) {
        Date date = new Date(start, end, timeZone);
        return createDateMentionRichText(date);
    }

    /**
     * 创建一个有格式的日期提及对象
     *
     * @param start    提及日期的开始时间（ISO 8601 格式的日期）可以为空
     * @param end      提及日期的结束时间（ISO 8601 格式的日期），可以为空
     * @param timeZone start 和 end 的时区信息
     * @return 数据库提及对象
     */
    public static MentionRichText createDateMentionRichText(String start, String end, String timeZone, Annotation annotation) {
        MentionRichText dateMentionRichText = createDateMentionRichText(start, end, timeZone);
        dateMentionRichText.setAnnotations(annotation);
        return dateMentionRichText;
    }

    /**
     * 创建一个有格式的日期提及对象
     *
     * @param date 日期提及对象的时间对象，详情查看{@link Date}
     * @return 期提及对象
     */
    public static MentionRichText createDateMentionRichText(Date date, Annotation annotation) {
        MentionRichText dateMentionRichText = createDateMentionRichText(date);
        dateMentionRichText.setAnnotations(annotation);
        return dateMentionRichText;
    }

}
