package com.lucky.notionapi.model.block.type.pdf;

import com.lucky.notionapi.model.block.AbstractBlock;
import com.lucky.notionapi.model.file.FileFile;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * FilePDF
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FilePDF extends AbstractBlock implements Pdf {

    private FileFile pdf;

    public FilePDF() {
        type = PDF;
    }

}
