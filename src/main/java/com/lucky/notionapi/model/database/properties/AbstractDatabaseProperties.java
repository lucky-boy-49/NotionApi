package com.lucky.notionapi.model.database.properties;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

/**
 * 页属性抽象类<br>
 * 每个数据库属性对象都包含的属性<br>
 * 每个数据库属性对象还包含一个类型对象。对象的键是对象的 type ，值是包含特定于类型的配置的对象。<br>
 *
 * @author jiahe
 */
@Data
public abstract class AbstractDatabaseProperties implements DatabaseProperties {

    /**
     * 属性的标识符，通常是由随机字母和符号组成的短字符串。
     */
    private String id;

    /**
     * 属性的名称出现在 Notion 中。
     */
    private String name;

    /**
     * 概念中出现的属性的描述。
     */
    private String description;

    /**
     * 控制属性行为的类型。
     *
     * @see DatabaseProperties
     */
    private String type;

    /**
     * 属性的自定义名称。
     * 如果未设置，则为空。
     */
    @JsonIgnore
    private String customizeName;

}
