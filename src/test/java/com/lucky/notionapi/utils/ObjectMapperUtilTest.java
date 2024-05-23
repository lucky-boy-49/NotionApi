package com.lucky.notionapi.utils;

import org.junit.jupiter.api.Test;

import java.util.List;

class ObjectMapperUtilTest {

    @Test
    void toJson() {
        List<Object> lis = List.of("test", "test2");

        String json = ObjectMapperUtil.toJson(lis);
        System.out.println(json);
    }
}