package com.lucky.notionapi.model.communal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.enumerate.ColorEnum;
import lombok.Data;

/**
 * 选项
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Options {

    /**
     * 选项的颜色。
     *
     * @see ColorEnum
     */
    private String color;

    /**
     * 选项的 ID。<br>
     * 您可以使用 id 或 name 更新多选属性。<br>
     * 创建时无需指定 id。<br>
     */
    private String id;

    /**
     * 选项的名称出现在 Notion 中。
     * 如果多选数据库属性尚无该名称的选项，并且集成还具有对父数据库的写访问权限，则该名称将添加到数据库架构中。
     * 注意：逗号 ( "," ) 对于选择值无效。
     */
    private String name;

}
