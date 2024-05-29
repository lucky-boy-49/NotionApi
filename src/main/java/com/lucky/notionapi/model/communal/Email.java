package com.lucky.notionapi.model.communal;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * 电子邮箱
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Email {

    private String email;

}
