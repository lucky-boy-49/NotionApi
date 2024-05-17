package com.lucky.notionapi.model.block.type;

import com.lucky.notionapi.model.block.AbstractBlock;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 方程
 * 方程块对象表示为段落块的子对象
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class EquationBlock extends AbstractBlock {

    private Equation equation;

    public EquationBlock() {
        this.equation = new Equation();
    }

    @Data
    static class Equation {

        /**
         * KaTeX 兼容的字符串。
         */
        private String expression;

    }

}
