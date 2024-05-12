package com.lucky.notionapi.model.block.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.lucky.notionapi.model.block.AbstractBlock;
import com.lucky.notionapi.model.block.richtext.RichTextType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 文件对象
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FileBlock extends AbstractBlock {

    private File file;

    @JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION, property = "type")
    @JsonSubTypes({
            @Type(value = ExternalFile.class, name = "external"),
            @Type(value = FileFile.class, name = "file")
    })
    interface File {

    }

    @Data
    static abstract class AbstrtactFile implements File {

        /**
         * 文件块的标题。
         *
         * @see RichTextType
         */
        private RichTextType[] caption;

        /**
         * 文件类型 file\external
         */
        private String type;

        /**
         * 文件块的名称，如 Notion UI 中所示。请注意，UI 可能会自动附加 .pdf 或其他扩展名。
         */
        private String name;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    static class ExternalFile extends AbstrtactFile {

        private External external;

        @Data
        static class External {

            private String url;
        }

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    static class FileFile extends AbstrtactFile {

        private File file;

        @Data
        static class File {

            private String url;

            @JsonProperty("expires_time")
            private String expiresTime;

        }

    }

}
