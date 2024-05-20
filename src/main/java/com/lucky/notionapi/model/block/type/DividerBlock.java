package com.lucky.notionapi.model.block.type;

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
public class DividerBlock extends AbstractBlock {

    private Divider divider;

    public DividerBlock() {
        divider = new Divider();
        type = DIVIDER;
    }

    @Data
    static class Divider {

    }

}
