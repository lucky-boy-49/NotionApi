package com.lucky.notionapi.model.parent.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.parent.AbstractParent;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 数据库父级
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DatabaseParent extends AbstractParent {

    /**
     * 该页面所属数据库的ID。UUIDv4
     */
    @JsonProperty("database_id")
    private String databaseId;

    public DatabaseParent() {
        // 始终为"database_id"
        type = "database_id";
    }

    @Override
    public String getType() {
        return type;
    }

}
