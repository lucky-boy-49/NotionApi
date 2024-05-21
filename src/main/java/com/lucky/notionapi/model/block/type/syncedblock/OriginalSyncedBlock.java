package com.lucky.notionapi.model.block.type.syncedblock;

import com.fasterxml.jackson.annotation.JsonInclude;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OriginalSyncedBlock extends AbstractSyncedBlock {

    public OriginalSyncedBlock() {
        type = SYNCED_BLOCK;
    }

    private SyncedBlock syncedBlock;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SyncedBlock {

        @JsonProperty("synced_from")
        private String syncedFrom;

        private BlockType[] children;

    }

}
