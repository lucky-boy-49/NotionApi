package com.lucky.notionapi.model.parent;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * 抽象Parent
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class AbstractParent implements Parent{

    /**
     * 每个“家长”都有一个类型，而且是固定值
     */
    protected String type;

}
