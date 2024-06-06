package com.lucky.notionapi.model.communal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.config.NotionConfig;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 * 电子邮箱
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Email {

    @Size(max = NotionConfig.ANY_EMAIL_SIZE, message = NotionConfig.ANY_EMAIL_MESSAGE)
    private String email;

}
