package com.lucky.notionapi.model.block.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.config.NotionConfig;
import com.lucky.notionapi.model.block.AbstractBlock;
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
public class SyncedBlocks extends AbstractBlock {

    @Valid
    @JsonProperty("synced_block")
    private SyncedBlock syncedBlock;

    public SyncedBlocks() {
        type = SYNCED_BLOCK;
    }

    @Data
    public static class SyncedBlock {

        /**
         * 该值始终为 null ，表示这是一个原始同步区块，不指向其他区块。
         */
        @JsonProperty("synced_from")
        private SyncedFrom syncedFrom;
        /**
         * synced_block 块的嵌套子块（如果有）。这些区块将被镜像到重复的 synced_block 中。
         */
        @Valid
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @Size(max = NotionConfig.BLOCK_ARRAY_SIZE, message = NotionConfig.BLOCK_ARRAY_MESSAGE)
        private BlockType[] children;

        @Data
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class SyncedFrom {

            private String type = "block_id";

            @JsonProperty("block_id")
            private String blockId;

        }

    }

}
