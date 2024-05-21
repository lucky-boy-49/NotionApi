package com.lucky.notionapi.model.block.type.syncedblock;

import com.fasterxml.jackson.annotation.JsonInclude;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DuplicateSyncedBlock extends AbstractSyncedBlock {

    @JsonProperty("synced_block")
    private SyncedBlock syncedBlock;

    public DuplicateSyncedBlock() {
        type = SYNCED_BLOCK;
    }

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SyncedBlock {

        @JsonProperty("synced_from")
        private SyncedFrom syncedFrom;

        @Data
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class SyncedFrom {

            @JsonProperty("block_id")
            private String blockId;

        }

    }

}
