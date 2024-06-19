package com.lucky.notionapi.util;

import org.junit.jupiter.api.Test;

class PageUtilsTest {

    @Test
    void creatPage() {
        System.out.println(PageUtils.creatPage(null, null, null, null, null));
    }

    @Test
    void creatCheckboxPageProperties() {
        System.out.println(PageUtils.creatCheckboxPageProperties("efa", false));
    }

    @Test
    void creatDatePageProperties() {
        System.out.println(PageUtils.creatDatePageProperties("efa", "2020-01-01", null));
    }

    @Test
    void creatEmailPageProperties() {
        System.out.println(PageUtils.creatEmailPageProperties("efa", "efpyi@example.com"));
    }

    @Test
    void creatFilePageProperties() {
        System.out.println(PageUtils.creatFilePageProperties("efa", null));
    }

    @Test
    void creatMultiSelectPageProperties() {
        System.out.println(PageUtils.creatMultiSelectPageProperties("efa", null));
    }

    @Test
    void creatNumberPageProperties() {
        System.out.println(PageUtils.creatNumberPageProperties("efa", 1));
    }

    @Test
    void creatPeoplePageProperties() {
        System.out.println(PageUtils.creatPeoplePageProperties("efa", null));
    }

    @Test
    void creatPhoneNumberPageProperties() {
        System.out.println(PageUtils.creatPhoneNumberPageProperties("efa", "12345678901"));
    }

    @Test
    void creatRelationPageProperties() {
        System.out.println(PageUtils.creatRelationPageProperties("efa", null));
    }

    @Test
    void creatRichTextPageProperties() {
        System.out.println(PageUtils.creatRichTextPageProperties("efa", null));
    }

    @Test
    void creatSelectPageProperties() {
        System.out.println(PageUtils.creatSelectPageProperties("efa", null));
    }

    @Test
    void creatStatusPageProperties() {
        System.out.println(PageUtils.creatStatusPageProperties("efa", null));
    }

    @Test
    void creatTitlePageProperties() {
        System.out.println(PageUtils.creatTitlePageProperties("efa", null));
    }

    @Test
    void creatURLPageProperties() {
        System.out.println(PageUtils.creatUrlPageProperties("efa", "https://www.baidu.com"));
    }
}