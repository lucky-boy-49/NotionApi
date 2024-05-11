package com.lucky.notionapi.model.user.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.lucky.notionapi.model.user.AbstractUser;

/**
 * 当用户对象代表机器人时，用户对象的 type 属性为 "bot" 。
 * @author jiahe
 */
public class Bots extends AbstractUser {

    /**
     * 如果您使用 GET /v1/users/me 或 GET /v1/users/{{your_bot_id}} ，则此字段返回有关机器人的数据，包括 owner 、 owner. type
     * 和 workspace_name 。
     * 例子：
     * { "object": "user", "id": "9188c6a5-7381-452f-b3dc-d4865aa89bdf", "name": "Test Integration", "avatar_url": null,
     * "type": "bot", "bot": { "owner": { "type": "workspace", "workspace": true }, "workspace_name": "Ada Lovelace’s Notion" } }
     */
    public ObjectNode bot;

    /**
     * 有关谁拥有此机器人的信息。
     * 例子{ "type": "workspace", "workspace": true }
     * type 属性可以是 "workspace" 或 "user" 。
     */
    public ObjectNode owner;

    /**
     * 如果 owner.type 是 "workspace" ，则 workspace.name 标识拥有机器人的工作区的名称。如果 owner.type 为 "user" ，
     * 则 workspace.name 为 null 。
     */
    @JsonProperty("workspace_name")
    public String workspaceName;

    public Bots() {
        type = "bot";
    }

}
