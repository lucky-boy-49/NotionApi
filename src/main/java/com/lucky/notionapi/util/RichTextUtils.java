package com.lucky.notionapi.util;

import com.lucky.notionapi.model.communal.richtext.Annotation;
import com.lucky.notionapi.model.communal.richtext.type.EquationRichText;
import com.lucky.notionapi.model.communal.richtext.type.TextRichText;

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

}
