package com.lucky.notionapi.model.database.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.config.NotionConfig;
import com.lucky.notionapi.model.communal.Color;
import com.lucky.notionapi.model.communal.Options;
import com.lucky.notionapi.model.database.properties.AbstractDatabaseProperties;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 选择<br>
 *
 * @author jiahe
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatusDatabaseProperties extends AbstractDatabaseProperties {

    @Valid
    private Status status;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Status {

        @Size(max = NotionConfig.ANY_MULTI_SELECT_SIZE, message = NotionConfig.ANY_MULTI_SELECT_MESSAGE)
        private Options[] options;

        @Size(max = NotionConfig.ANY_MULTI_SELECT_SIZE, message = NotionConfig.ANY_MULTI_SELECT_MESSAGE)
        private Groups[] groups;

    }

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Groups {

        /**
         * 选项的颜色。
         *
         * @see Color
         */
        private String color;

        /**
         * 选项的 ID。<br>
         * 您可以使用 id 或 name 更新选择的属性。
         */
        private String id;

        /**
         * 出现在 Notion 中选项的名称<br>
         * 如果选择数据库属性尚无该名称的选项，并且集成还具有对父数据库的写入访问权限，则该名称将添加到数据库架构中。
         */
        private String name;

        /**
         * 属于某个组的所有选项的 id 的排序列表。
         */
        @JsonProperty("option_ids")
        private String[] optionIds;

    }

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public StatusDatabaseProperties(Boolean initType) {
        if (initType) {
            type = STATUS;
        }
    }

}
