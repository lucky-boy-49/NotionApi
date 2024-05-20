package com.lucky.notionapi.model.block.richtext.type.mention;

import lombok.Data;

/**
 * 数据库提及类型对象
 * 数据库提及在相应的 database 字段中包含数据库引用。数据库引用是一个具有 id 键和与数据库 ID 对应的字符串值 (UUIDv4) 的对象。
 * 如果集成无权访问提到的数据库，则仅返回 ID 。作为标题的 plain_text 值显示为 "Untitled" ，注释对象的值是默认值。
 * @author jiahe
 */
@Data
public class DatabaseMention implements Mention {

    private String type;

    private Database database;

    public DatabaseMention() {
        database = new Database();
        type = DATABASE;
    }

    @Data
    static class Database {

        private String id;

    }

}
