package com.lucky.notionapi.model.block.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.block.AbstractBlock;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 子数据库
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChildDatabaseBlock extends AbstractBlock {

    /**
     * 要创建或更新 child_database 类型块，请使用创建数据库和更新数据库端点，
     * 并在 parent 正文参数中指定父页面的 ID。
     */
    @JsonProperty("child_database")
    private ChildDatabase childDatabase;

    public ChildDatabaseBlock() {
        type = CHILD_DATABASE;
    }

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ChildDatabase {

        /**
         * 数据库的纯文本标题。
         */
        private String title;

    }

}
