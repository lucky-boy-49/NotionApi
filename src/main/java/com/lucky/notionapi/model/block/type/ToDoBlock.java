package com.lucky.notionapi.model.block.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.enumerate.Color;
import com.lucky.notionapi.model.block.AbstractBlock;
import com.lucky.notionapi.model.block.BlockType;
import com.lucky.notionapi.model.block.richtext.RichTextType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 任务
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ToDoBlock extends AbstractBlock {

    @JsonProperty("to_do")
    private ToDo toDo;

    public ToDoBlock() {
        toDo = new ToDo();
        type = TO_DO;
    }

    @Data
    static class ToDo {

        /**
         * 待办事项块中显示的富文本。
         *
         * @see RichTextType
         */
        @JsonProperty("rich_text")
        private RichTextType[] richText;

        /**
         * 是否勾选待办事项。
         */
        private Boolean checked;

        /**
         * 块的颜色
         *
         * @see Color
         */
        private String color;

        /**
         * To do 块的嵌套子块（如果有）。
         */
        private BlockType[] children;

    }

}
