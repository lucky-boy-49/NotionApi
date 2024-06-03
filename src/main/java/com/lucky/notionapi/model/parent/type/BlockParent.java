package com.lucky.notionapi.model.parent.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.parent.AbstractParent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 块父级
 * 如果页面是在文本块中内联创建的，或者位于另一个块（如切换块或项目符号块）下方，则该页面可能具有块父级。 parent 属性是一个包含以下键的对象
 * @author jiahe
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockParent extends AbstractParent {

    /**
     * 该页面所属页面的ID
     */
    @JsonProperty("block_id")
    private String blockId;

    @Override
    public String getType() {
        return type;
    }

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public BlockParent(Boolean initType) {
        if (initType) {
            type = "block_id";
        }
    }

}
