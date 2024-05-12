package com.lucky.notionapi.model.block.type.pdf;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.lucky.notionapi.model.block.BlockType;

/**
 * @author 贺佳
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION, property = "type")
@JsonSubTypes({
        @Type(value = ExternalPDF.class, name = "external"),
        @Type(value = FilePDF.class, name = "file"),
})
public interface Pdf extends BlockType {
}
