package com.lucky.notionapi.util;

import org.junit.jupiter.api.Test;

import java.util.List;

class ObjectMapperUtilTest {

    @Test
    void toJson() {
        List<Object> lis = List.of("test", "test2");

        String json = ObjectMapperUtils.toJson(lis);
        System.out.println(json);
    }
}