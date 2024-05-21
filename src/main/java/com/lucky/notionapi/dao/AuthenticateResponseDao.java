package com.lucky.notionapi.dao;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 创建一个令牌的响应对象
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthenticateResponseDao {

    /**
     * 访问令牌
     */
    @JsonProperty("access_token")
    private String accessToken;

    /**
     * 机器人id
     */
    @JsonProperty("bot_id")
    private String botId;

    /**
     * 重复的模板id
     */
    @JsonProperty("duplicated_template_id")
    private String duplicatedTemplateId;

    /**
     * 所有者
     */
    private Owner owner;

    /**
     * 工作空间图标
     */
    @JsonProperty("workspace_icon")
    private String workspaceIcon;

    /**
     * 工作空间_id
     */
    @JsonProperty("workspace_id")
    private String workspaceId;

    /**
     * 工作空间名称
     */
    @JsonProperty("workspace_name")
    private String workspaceName;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Owner {

        private String workspace;

    }

}
