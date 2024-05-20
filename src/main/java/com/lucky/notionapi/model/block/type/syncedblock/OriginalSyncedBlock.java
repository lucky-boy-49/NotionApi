package com.lucky.notionapi.model.block.type.syncedblock;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.block.BlockType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 原始同步块
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OriginalSyncedBlock extends AbstractSyncedBlock {

    public OriginalSyncedBlock() {
        syncedBlock = new SyncedBlock();
        type = SYNCED_BLOCK;
    }

    private SyncedBlock syncedBlock;

    @Data
    static class SyncedBlock {

        @JsonProperty("synced_from")
        private String syncedFrom;

        private BlockType[] children;

    }

}
