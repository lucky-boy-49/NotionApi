package com.lucky.notionapi.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * json转换跟格局
 *
 * @author jiahe
 */
@Slf4j
public class ObjectMapperUtil {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public static String toJson(Object obj) {
        try {
            return OBJECT_MAPPER.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            log.error("实体类转换Json异常：", e);
        }
        return "";
    }

    public static String toJson(Object... objs) {
        try {
            return OBJECT_MAPPER.writeValueAsString(objs);
        } catch (JsonProcessingException e) {
            log.error("实体类转换Json异常：", e);
        }
        return "";
    }

}
