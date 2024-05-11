package com.lucky.notionapi.model.block.richtext.type.mention;

import com.lucky.notionapi.model.block.richtext.type.Mention;
import lombok.Data;

/**
 * 用户提及类型对象
 * 如果富文本对象的 type 值为 "user" ，则相应的用户字段包含一个用户对象。
 * 如果您的集成尚无权访问上述用户，则包含用户名的 plain_text 将读取为 "@Anonymous" 。要更新集成以获取用户的访问权限，
 * 请更新集成设置页面上的集成功能。
 * @author jiahe
 */
@Data
public class UserMention implements Mention {

    private String type;

    private User user;

    @Data
    static class User {

        private String object;

        private String id;

    }

}
