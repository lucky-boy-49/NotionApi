package com.lucky.notionapi.model.database.filter.conditions;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 文件过滤器
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FilesFilter extends AbstratctFilterObject {

    private FilesConditions files;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class FilesConditions {

        /**
         * 文件属性值是否不包含任何数据。返回所有属性值为空的 files 数据库条目。
         */
        @JsonProperty("is_empty")
        private Boolean isEmpty;

        /**
         * 返回已填充 files 属性值的所有条目。
         */
        @JsonProperty("is_not_empty")
        private Boolean isNotEmpty;

    }

}
