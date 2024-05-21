package com.lucky.notionapi.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
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

    private static ObjectMapper objectMapper;

    public ObjectMapperUtil() {
        objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
    }

    public static String toJson(Object obj) {
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            log.error("实体类转换Json异常：", e);
        }
        return "";
    }

}
