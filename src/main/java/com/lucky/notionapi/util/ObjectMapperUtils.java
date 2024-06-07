package com.lucky.notionapi.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * json转换跟格局
 *
 * @author jiahe
 */
@Slf4j
public class ObjectMapperUtils {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public static String toJson(Object... objs) {
        try {
            if (objs.length == 1) {
                return OBJECT_MAPPER.writeValueAsString(objs[0]);
            }
            return OBJECT_MAPPER.writeValueAsString(objs);
        } catch (JsonProcessingException e) {
            log.error("实体类转换Json异常：", e);
        }
        return "";
    }

}
