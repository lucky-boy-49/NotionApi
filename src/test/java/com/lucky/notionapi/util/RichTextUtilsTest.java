package com.lucky.notionapi.util;

import com.lucky.notionapi.model.communal.richtext.Annotation;
import com.lucky.notionapi.model.communal.richtext.type.EquationRichText;
import org.junit.jupiter.api.Test;

class RichTextUtilsTest {

    @Test
    void createEquationRichText() {

        Annotation annotation = Annotation.builder().color("red").build();
        String equation = "x^2+y^2=z^2";
        EquationRichText res = RichTextUtils.createEquationRichText(equation, annotation);
        System.out.println(res);

    }
}