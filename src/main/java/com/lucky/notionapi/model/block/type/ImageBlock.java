package com.lucky.notionapi.model.block.type;

import com.lucky.notionapi.model.block.AbstractBlock;
import com.lucky.notionapi.model.file.ExternalFile;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 图像块对象包含一个文件对象
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ImageBlock extends AbstractBlock {

    /**
     * 文件对象即icon对象
     */
    private ExternalFile image;

    public ImageBlock() {
        type = IMAGE;
    }

}
