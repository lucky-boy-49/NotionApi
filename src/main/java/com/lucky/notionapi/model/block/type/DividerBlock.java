package com.lucky.notionapi.model.block.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.model.block.AbstractBlock;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 分隔符
 * 分隔符块对象的 divider 属性中不包含任何信息。
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DividerBlock extends AbstractBlock {

    private Divider divider;

    public DividerBlock() {
        type = DIVIDER;
    }

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Divider {

    }

}
