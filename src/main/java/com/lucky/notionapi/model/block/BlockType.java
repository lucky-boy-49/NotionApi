package com.lucky.notionapi.model.block;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.lucky.notionapi.model.block.type.*;
import com.lucky.notionapi.model.block.type.heading.HeadingBlock1;
import com.lucky.notionapi.model.block.type.heading.HeadingBlock2;
import com.lucky.notionapi.model.block.type.heading.HeadingBlock3;
import com.lucky.notionapi.model.block.type.pdf.Pdf;
import com.lucky.notionapi.model.block.type.table.AbstractTableBlock;
import com.lucky.notionapi.model.block.type.video.Video;
import com.lucky.notionapi.model.communal.richtext.type.mention.Mention;

import static com.lucky.notionapi.model.block.BlockType.*;

/**
 * 块类型接口
 * 定义块类型的特征
 * 每个块对象都有一个与 type 值对应的键。键下是一个具有特定于类型的块信息的对象。
 *
 * @author jiahe
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = BookmarkBlock.class,
        include = JsonTypeInfo.As.EXISTING_PROPERTY)
@JsonSubTypes({
        @Type(value = BookmarkBlock.class, name = BOOKMARK),
        @Type(value = BreadcrumbBlock.class, name = BREADCRUMB),
        @Type(value = BulletedListItemBlock.class, name = BULLETED_LIST_ITEM),
        @Type(value = CalloutBlock.class, name = CALLOUT),
        @Type(value = ChildDatabaseBlock.class, name = CHILD_DATABASE),
        @Type(value = ChildPageBlock.class, name = CHILD_PAGE),
        @Type(value = CodeBlock.class, name = CODE),
        @Type(value = ColumnListBlock.class, name = COLUMN_LIST),
        @Type(value = ColumnBlock.class, name = COLUMN),
        @Type(value = DividerBlock.class, name = DIVIDER),
        @Type(value = EmbedBlock.class, name = EMBED),
        @Type(value = EquationBlock.class, name = EQUATION),
        @Type(value = FileBlock.class, name = FILE),
        @Type(value = HeadingBlock1.class, name = HEADING_1),
        @Type(value = HeadingBlock2.class, name = HEADING_2),
        @Type(value = HeadingBlock3.class, name = HEADING_3),
        @Type(value = ImageBlock.class, name = IMAGE),
        @Type(value = LinkPreviewBlock.class, name = LINK_PREVIEW),
        @Type(value = Mention.class, name = MENTION),
        @Type(value = NumberedListItemBlock.class, name = NUMBERED_LIST_ITEM),
        @Type(value = ParagraphBlock.class, name = PARAGRAPH),
        @Type(value = Pdf.class, name = PDF),
        @Type(value = QuoteBlock.class, name = QUOTE),
        @Type(value = SyncedBlocks.class, name = SYNCED_BLOCK),
        @Type(value = AbstractTableBlock.class, name = TABLE),
        @Type(value = AbstractTableBlock.class, name = TABLE_ROW),
        @Type(value = TableOfContentsBlock.class, name = TABLE_OF_CONTENTS),
        @Type(value = ToDoBlock.class, name = TO_DO),
        @Type(value = ToggleBlock.class, name = TOGGLE),
        @Type(value = Video.class, name = VIDEO),
})
public interface BlockType {

    /**
     * 书签
     */
    String BOOKMARK = "bookmark";
    /**
     * 面包屑
     */
    String BREADCRUMB = "breadcrumb";
    /**
     * 项目符号列表项
     */
    String BULLETED_LIST_ITEM = "bulleted_list_item";
    /**
     * 意见
     */
    String CALLOUT = "callout";
    /**
     * 子数据库
     */
    String CHILD_DATABASE = "child_database";
    /**
     * 子页面
     */
    String CHILD_PAGE = "child_page";
    /**
     * 代码块
     */
    String CODE = "code";
    /**
     * 列表
     */
    String COLUMN_LIST = "column_list";
    /**
     * 列
     */
    String COLUMN = "column";
    /**
     * 分隔符
     */
    String DIVIDER = "divider";
    /**
     * 嵌入
     */
    String EMBED = "embed";
    /**
     * 方程
     */
    String EQUATION = "equation";
    /**
     * 文件
     */
    String FILE = "file";
    /**
     * 标题1
     */
    String HEADING_1 = "heading_1";
    /**
     * 标题2
     */
    String HEADING_2 = "heading_2";
    /**
     * 标题3
     */
    String HEADING_3 = "heading_3";
    /**
     * 图像
     */
    String IMAGE = "image";
    /**
     * 链接预览
     */
    String LINK_PREVIEW = "link_preview";
    /**
     * 提到
     *
     * @see Mention
     */
    String MENTION = "Mention";
    /**
     * 编号列表项
     */
    String NUMBERED_LIST_ITEM = "numbered_list_item";
    /**
     * 段落
     */
    String PARAGRAPH = "paragraph";
    /**
     * PDF
     */
    String PDF = "pdf";
    /**
     * 引用
     */
    String QUOTE = "quote";
    /**
     * 同步块
     */
    String SYNCED_BLOCK = "synced_block";
    /**
     * 表格
     */
    String TABLE = "table";
    /**
     * 表格行
     */
    String TABLE_ROW = "table_row";
    /**
     * 目录
     */
    String TABLE_OF_CONTENTS = "table_of_contents";
    /**
     * 任务
     */
    String TO_DO = "to_do";
    /**
     * 切换
     */
    String TOGGLE = "toggle";
    /**
     * 视频
     */
    String VIDEO = "video";


}
