package com.lucky.notionapi.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 错误响应
 *
 * @author jiahe
 */
@Data
public class ErrorDao {

    private String object;

    private String status;

    private String code;

    private String message;

    @JsonProperty("developer_survey")
    private String developerSurvey;

    @JsonProperty("request_id")
    private String requestId;

}
