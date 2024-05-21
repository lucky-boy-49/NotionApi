package com.lucky.notionapi.model.block.type;

import com.fasterxml.jackson.annotation.JsonInclude;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FileBlock extends AbstractBlock {

    private File file;

    public FileBlock() {
        type = FILE;
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION, property = "type")
    @JsonSubTypes({
            @Type(value = ExternalFile.class, name = "external"),
            @Type(value = FileFile.class, name = "file")
    })
    public interface File {

    }

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static abstract class AbstrtactFile implements File {

        /**
         * 文件块的标题。
         *
         * @see RichTextType
         */
        protected RichTextType[] caption;

        /**
         * 文件类型 file\external
         */
        protected String type;

        /**
         * 文件块的名称，如 Notion UI 中所示。请注意，UI 可能会自动附加 .pdf 或其他扩展名。
         */
        protected String name;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ExternalFile extends AbstrtactFile {

        private External external;

        public ExternalFile() {
            type = "external";
        }

        @Data
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class External {

            private String url;
        }

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class FileFile extends AbstrtactFile {

        private File file;

        public FileFile() {
            type = "file";
        }

        @Data
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class File {

            private String url;

            @JsonProperty("expires_time")
            private String expiresTime;

        }

    }

}
