package com.lucky.notionapi.model.block.type.pdf;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.model.block.AbstractBlock;
import com.lucky.notionapi.model.file.ExternalFile;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * ExternalPDF
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExternalPDF extends AbstractBlock implements Pdf {

    private ExternalFile pdf;

    public ExternalPDF() {
        type = PDF;
    }

}
