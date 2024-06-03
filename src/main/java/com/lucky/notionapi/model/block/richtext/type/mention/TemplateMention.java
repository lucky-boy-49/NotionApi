package com.lucky.notionapi.model.block.richtext.type.mention;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 模板提及类型对象
 * Notion UI 中模板按钮内的内容可以包括占位符日期和用户提及，这些内容会在复制模板时填充。模板提及类型对象包含这些填充值。
 * 模板提及富文本对象包含一个 template_mention 对象，该对象具有嵌套的 type 键，该键为 "template_mention_date"
 * 或 "template_mention_user" 。
 * @author jiahe
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TemplateMention implements Mention {

    private String type;

    @JsonProperty("template_mention")
    private Template template;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public TemplateMention(Boolean initType) {
        if (initType) {
            type = TEMPLATE_MENTION;
        }
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION, property = "type")
    @JsonSubTypes({
            @Type(value = TemplateMentionDate.class, name = Template.TEMPLATE_MENTION_DATE),
            @Type(value = TemplateMentionUser.class, name = Template.TEMPLATE_MENTION_USER),
    })
    public interface Template {

        String TEMPLATE_MENTION_DATE = "template_mention_date";

        String TEMPLATE_MENTION_USER = "template_mention_user";

    }

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class TemplateMentionDate implements Template {
        /**
         * type 键为 "template_mention_date" 则{@link #templateMentionDate}可能为可能的值包括： "today" 和 "now" 。
         */
        private String type;

        @JsonProperty("template_mention_date")
        private String templateMentionDate;

    }

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class TemplateMentionUser implements Template {
        /**
         * type 键为 "template_mention_user" 则{@link #templateMentionUser}可能的值是 "me" 。
         */
        private String type;

        @JsonProperty("template_mention_user")
        private String templateMentionUser;

    }

}
