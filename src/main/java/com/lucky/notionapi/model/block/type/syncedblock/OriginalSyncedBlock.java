package com.lucky.notionapi.model.block.type.syncedblock;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.config.NotionConfig;
import com.lucky.notionapi.model.block.BlockType;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
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

    @Valid
    private SyncedBlock syncedBlock;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SyncedBlock {

        @JsonProperty("synced_from")
        private String syncedFrom;

        @Size(max = NotionConfig.BLOCK_ARRAY_SIZE, message = NotionConfig.BLOCK_ARRAY_MESSAGE)
        private BlockType[] children;

    }

}
