package com.lucky.notionapi.model.block.type.video;

import com.lucky.notionapi.model.block.AbstractBlock;
import com.lucky.notionapi.model.file.ExternalFile;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * ExternalVideo
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ExternalVideo extends AbstractBlock implements Video {

    private ExternalFile video;

    public ExternalVideo() {
        type = VIDEO;
    }

}
