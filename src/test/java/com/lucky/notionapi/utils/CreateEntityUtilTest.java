package com.lucky.notionapi.utils;

import com.lucky.notionapi.dao.AuthenticateDao;
import org.junit.jupiter.api.Test;

class CreateEntityUtilTest {

    @Test
    void createAuthenticateDao() {
        AuthenticateDao authenticateDao = CreateEntityUtil.createAuthenticateDao("faffef", "wfawfewa", "ffffffff", null, null);
        System.out.println(authenticateDao);
    }
}