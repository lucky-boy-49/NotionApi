package com.lucky.notionapi.model.block.type.pdf;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.model.block.AbstractBlock;
import com.lucky.notionapi.model.file.FileFile;
import jakarta.validation.Valid;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * FilePDF
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FilePDF extends AbstractBlock implements Pdf {

    @Valid
    private FileFile pdf;

    public FilePDF() {
        type = PDF;
    }

}
