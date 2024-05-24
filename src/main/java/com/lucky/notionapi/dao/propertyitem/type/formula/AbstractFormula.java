package com.lucky.notionapi.dao.propertyitem.type.formula;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * 公式属性值抽象类<br>
 * 数据库的属性。这些对象包含一个 type 键和一个与 type 值相对应的键。值是一个包含特定类型数据的对象。特定类型数据将在下面的章节中介绍。
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class AbstractFormula implements Formula {

    /**
     * 公式结果的类型。
     *
     * @see Formula
     */
    protected String type;

}
