package com.lucky.notionapi.util;

import com.lucky.notionapi.model.communal.Date;
import com.lucky.notionapi.model.communal.richtext.Annotation;
import com.lucky.notionapi.model.communal.richtext.type.EquationRichText;
import com.lucky.notionapi.model.communal.richtext.type.MentionRichText;
import org.junit.jupiter.api.Test;

class RichTextUtilsTest {

    @Test
    void createEquationRichText() {

        Annotation annotation = Annotation.builder().color("red").build();
        String equation = "x^2+y^2=z^2";
        EquationRichText res = RichTextUtils.createEquationRichText(equation, annotation);
        System.out.println(res);

    }

    @Test
    void createDatabaseMentionRichText() {
        Annotation annotation = Annotation.builder().color("red").build();
        String id = "ahfeiafnwafnweaoi";
        MentionRichText res = RichTextUtils.createDatabaseMentionRichText(id, annotation);
        System.out.println(res);
    }

    @Test
    void createDateMentionRichText() {
        Annotation annotation = Annotation.builder().color("red").build();
        MentionRichText res = RichTextUtils.createDateMentionRichText(new Date("fafea", "feafw", null), annotation);
        System.out.println(res);
        res = RichTextUtils.createDateMentionRichText("fawfeawf", "fewafwaf", null, annotation);
        System.out.println(res);
    }

    @Test
    void createLinkPreviewMentionRichText() {
        Annotation annotation = Annotation.builder().color("red").build();
        MentionRichText richText = RichTextUtils.createLinkPreviewMentionRichText("fafefa", annotation);
        System.out.println(richText);
    }
}