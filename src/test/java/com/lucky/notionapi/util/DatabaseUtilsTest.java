package com.lucky.notionapi.util;

import com.lucky.notionapi.enumerate.NumberFormatEnum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class DatabaseUtilsTest {

    @Test
    void creatDatabaseDao() {
        assertNotNull(DatabaseUtils.creatDatabaseDao(null, null, null));
    }

    @Test
    void creatCheckboxDatabaseProperties() {
        assertNotNull(DatabaseUtils.creatCheckboxDatabaseProperties("测试"));
    }

    @Test
    void creatCreatedByDatabaseProperties() {
        assertNotNull(DatabaseUtils.creatCreatedByDatabaseProperties("测试"));
    }

    @Test
    void creatCreatedTimeDatabaseProperties() {
        assertNotNull(DatabaseUtils.creatCreatedTimeDatabaseProperties("测试"));
    }

    @Test
    void creatDateDatabaseProperties() {
        assertNotNull(DatabaseUtils.creatDateDatabaseProperties("测试"));
    }

    @Test
    void creatDualPropertyRelationDatabaseProperties() {
        assertNotNull(DatabaseUtils.creatDualPropertyRelationDatabaseProperties("测试", "efafewaf"));
    }

    @Test
    void creatEmailDatabaseProperties() {
        assertNotNull(DatabaseUtils.creatEmailDatabaseProperties("测试"));
    }

    @Test
    void creatFilesDatabaseProperties() {
        assertNotNull(DatabaseUtils.creatFilesDatabaseProperties("测试"));
    }

    @Test
    void creatFormulaDatabaseProperties() {
        assertNotNull(DatabaseUtils.creatFormulaDatabaseProperties("测试", ""));
    }

    @Test
    void creatLastEditedByDatabaseProperties() {
        assertNotNull(DatabaseUtils.creatLastEditedByDatabaseProperties("测试"));
    }

    @Test
    void creatLastEditedTimeDatabaseProperties() {
        assertNotNull(DatabaseUtils.creatLastEditedTimeDatabaseProperties("测试"));
    }

    @Test
    void creatMultiSelectDatabaseProperties() {
        assertNotNull(DatabaseUtils.creatMultiSelectDatabaseProperties("测试", null));
    }

    @Test
    void creatNumberDatabaseProperties() {
        assertNotNull(DatabaseUtils.creatNumberDatabaseProperties("测试", NumberFormatEnum.NUMBER));
    }

    @Test
    void creatPeopleDatabaseProperties() {
        assertNotNull(DatabaseUtils.creatPeopleDatabaseProperties("测试"));
    }

    @Test
    void creatPhoneNumberDatabaseProperties() {
        assertNotNull(DatabaseUtils.creatPhoneNumberDatabaseProperties("测试"));
    }

    @Test
    void creatSinglePropertyRelationDatabaseProperties() {
        assertNotNull(DatabaseUtils.creatSinglePropertyRelationDatabaseProperties("测试", "efafewaf"));
    }

    @Test
    void creatRichTextDatabaseProperties() {
        assertNotNull(DatabaseUtils.creatRichTextDatabaseProperties("测试"));
    }

    @Test
    void creatRollupDatabaseProperties() {
        assertNotNull(DatabaseUtils.creatRollupDatabaseProperties("测试", "efafewaf",
                "", "", "", ""));
    }

    @Test
    void creatSelectDatabaseProperties() {
        assertNotNull(DatabaseUtils.creatSelectDatabaseProperties("测试", null));
    }

    @Test
    void creatTitleDatabaseProperties() {
        assertNotNull(DatabaseUtils.creatTitleDatabaseProperties("测试"));
    }

    @Test
    void creatUrlDatabaseProperties() {
        assertNotNull(DatabaseUtils.creatUrlDatabaseProperties("测试"));
    }

    @Test
    void creatDatabaseProperties() {
        assertNotNull(DatabaseUtils.creatDatabaseProperties(null));
    }
}