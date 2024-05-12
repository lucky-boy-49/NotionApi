package com.lucky.notionapi.model.block.type.syncedblock;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 重复的同步块
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DuplicateSyncedBlock extends AbstractSyncedBlock {

    @JsonProperty("synced_block")
    private SyncedBlock syncedBlock;

    @Data
    static class SyncedBlock {

        @JsonProperty("synced_from")
        private SyncedFrom syncedFrom;

        @Data
        static class SyncedFrom {

            @JsonProperty("block_id")
            private String blockId;

        }

    }

}
