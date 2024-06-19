package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.config.NotionConfig;
import com.lucky.notionapi.model.page.properties.AbstractPageProperties;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 邮箱
 *
 * @author 贺佳
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmailPageProperties extends AbstractPageProperties {

    /**
     * 描述电子邮件地址的字符串。
     */
    @Email
    @JsonProperty(value = "email", access = JsonProperty.Access.WRITE_ONLY)
    @Size(max = NotionConfig.ANY_EMAIL_SIZE, message = NotionConfig.ANY_EMAIL_MESSAGE)
    private String email;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public EmailPageProperties(Boolean initType) {
        if (initType) {
            type = EMAIL;
        }
    }

}
