package com.lucky.notionapi.model.block.type.syncedblock;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.lucky.notionapi.model.block.AbstractBlock;

/**
 * 同步块
 * 与 Notion UI 类似， synced_block 对象有两个版本：首先创建且尚未与其他任何内容同步的原始块，以及与原始块同步的重复块。
 * 必须先创建原始同步块，然后才能制作相应的复制块。
 *
 * @author 贺佳
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({
        @Type(value = OriginalSyncedBlock.class),
        @Type(value = DuplicateSyncedBlock.class),
})
public abstract class AbstractSyncedBlock extends AbstractBlock {
}
