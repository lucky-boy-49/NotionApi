package com.lucky.notionapi.utils;

import com.lucky.notionapi.dao.AuthenticateDao;
import com.lucky.notionapi.model.communal.Color;
import com.lucky.notionapi.model.communal.richtext.Annotation;
import org.junit.jupiter.api.Test;

class CreateEntityUtilTest {

    @Test
    void createAuthenticateDao() {
        AuthenticateDao authenticateDao = CreateEntityUtil.createAuthenticateDao("faffef", "wfawfewa", "ffffffff", null, null);
        System.out.println(authenticateDao);
    }

    @Test
    void createHeadingBlock() {
        System.out.println(CreateEntityUtil.createHeadingBlock(1, "fafawfwafw"));
    }

    @Test
    void createTextRichText() {
        Annotation annotation = Annotation.builder().bold(true).italic(true).color(Color.GRAY).build();
        System.out.println(CreateEntityUtil.createTextRichText("cafawf", annotation));
        System.out.println(CreateEntityUtil.createTextRichText("cafawf1", "cafawf1", annotation));
    }

}