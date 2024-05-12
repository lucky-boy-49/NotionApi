package com.lucky.notionapi.model.block.type.video;

import com.lucky.notionapi.model.block.AbstractBlock;
import com.lucky.notionapi.model.icon.FileIcon;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * FileVideo
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FileVideo extends AbstractBlock implements Video {

    private FileIcon video;

}
