package com.lucky.notionapi.util;

import com.lucky.notionapi.model.block.BlockType;
import com.lucky.notionapi.model.block.type.*;
import com.lucky.notionapi.model.block.type.heading.HeadingBlock1;
import com.lucky.notionapi.model.block.type.heading.HeadingBlock2;
import com.lucky.notionapi.model.block.type.heading.HeadingBlock3;
import com.lucky.notionapi.model.block.type.pdf.ExternalPDF;
import com.lucky.notionapi.model.block.type.pdf.FilePDF;
import com.lucky.notionapi.model.block.type.pdf.Pdf;
import com.lucky.notionapi.model.block.type.table.TableBlock;
import com.lucky.notionapi.model.block.type.table.TableRowsBlock;
import com.lucky.notionapi.model.block.type.video.ExternalVideo;
import com.lucky.notionapi.model.block.type.video.FileVideo;
import com.lucky.notionapi.model.block.type.video.Video;
import com.lucky.notionapi.model.communal.CodeLanguage;
import com.lucky.notionapi.model.communal.Color;
import com.lucky.notionapi.model.communal.richtext.RichTextType;
import com.lucky.notionapi.model.communal.richtext.type.TextRichText;
import com.lucky.notionapi.model.file.ExternalFile;
import com.lucky.notionapi.model.file.FileFile;
import com.lucky.notionapi.model.file.FileType;

/**
 * 块类型工具
 *
 * @author jiahe
 */
public class BlockUtils {

    /**
     * 创建一个标题1块
     *
     * @param con          块内容
     * @param color        块颜色
     * @param isToggleable 标题块是否是切换标题
     * @return 标题1块
     */
    public static HeadingBlock1 creatHeadingBlock1(TextRichText[] con, String color, Boolean isToggleable) {
        HeadingBlock1 headingBlock1 = new HeadingBlock1();
        headingBlock1.setHeading1(new HeadingBlock1.Heading1());
        headingBlock1.getHeading1().setRichText(con);
        headingBlock1.getHeading1().setColor(color);
        headingBlock1.getHeading1().setIsToggleable(isToggleable);
        return headingBlock1;
    }

    /**
     * 创建一个标题2块
     *
     * @param con          块内容
     * @param color        块颜色
     * @param isToggleable 标题块是否是切换标题
     * @return 标题2块
     */
    public static HeadingBlock2 creatHeadingBlock2(TextRichText[] con, String color, Boolean isToggleable) {
        HeadingBlock2 headingBlock2 = new HeadingBlock2();
        headingBlock2.setHeading2(new HeadingBlock2.Heading2());
        headingBlock2.getHeading2().setColor(color);
        headingBlock2.getHeading2().setIsToggleable(isToggleable);
        headingBlock2.getHeading2().setRichText(con);
        return headingBlock2;
    }

    /**
     * 创建一个标题3块
     *
     * @param con          块内容
     * @param color        块颜色
     * @param isToggleable 标题块是否是切换标题
     * @return 标题3块
     */
    public static HeadingBlock3 creatHeadingBlock3(TextRichText[] con, String color, Boolean isToggleable) {
        HeadingBlock3 headingBlock3 = new HeadingBlock3();
        headingBlock3.setHeading3(new HeadingBlock3.Heading3());
        headingBlock3.getHeading3().setColor(color);
        headingBlock3.getHeading3().setIsToggleable(isToggleable);
        headingBlock3.getHeading3().setRichText(con);
        return headingBlock3;
    }

    /**
     * 创建一个PDF文件块
     *
     * @param url  文件地址
     * @param flog 是否为第三分托管文件
     * @return PDF文件块
     */
    public static Pdf creatPdf(String url, Boolean flog) {
        if (flog) {
            ExternalPDF externalPdf = new ExternalPDF();
            ExternalFile externalFile = new ExternalFile(true);
            externalFile.setExternal(new ExternalFile.External());
            externalFile.getExternal().setUrl(url);
            externalPdf.setPdf(externalFile);
            return externalPdf;
        } else {
            FilePDF filePdf = new FilePDF();
            FileFile fileFile = new FileFile(true);
            fileFile.setFile(new FileFile.File());
            fileFile.getFile().setUrl(url);
            filePdf.setPdf(fileFile);
            return filePdf;
        }
    }

    /**
     * 创建一个原始同步块
     *
     * @param children synced_block 块的嵌套子块（如果有）。这些区块将被镜像到重复的 synced_block 中。
     * @return 原始同步块
     */
    public static SyncedBlocks creatOriginalSyncedBlock(BlockType[] children) {
        SyncedBlocks res = new SyncedBlocks();
        res.setSyncedBlock(new SyncedBlocks.SyncedBlock());
        res.getSyncedBlock().setChildren(children);
        return res;
    }

    /**
     * 创建一个重复同步块
     *
     * @param blockId 原始 synced_block 的标识符。
     * @return 重复同步块
     */
    public static SyncedBlocks creatDuplicateSyncedBlock(String blockId) {
        SyncedBlocks res = new SyncedBlocks();
        res.setSyncedBlock(new SyncedBlocks.SyncedBlock());
        res.getSyncedBlock().setSyncedFrom(new SyncedBlocks.SyncedBlock.SyncedFrom());
        res.getSyncedBlock().getSyncedFrom().setBlockId(blockId);
        return res;
    }

    /**
     * 创建一个表格块
     *
     * @param width           表格列数
     * @param hasColumnHeader 表格是否有列头
     * @param hasRowHeader    表格是否有行头
     * @return 表格块
     */
    public static TableBlock creatTableBlock(Integer width, Boolean hasColumnHeader, Boolean hasRowHeader) {
        TableBlock res = new TableBlock();
        res.setTable(new TableBlock.Table());
        res.getTable().setTableWidth(width);
        res.getTable().setHasColumnHeader(hasColumnHeader);
        res.getTable().setHasRowHeader(hasRowHeader);
        return res;
    }

    /**
     * 创建一个表格行块
     *
     * @param cells 按水平显示顺序排列的单元格内容数组。每个单元格都是一个富文本对象数组。
     * @return 表格行块
     */
    public static TableRowsBlock creatTableRowsBlock(RichTextType[] cells) {
        TableRowsBlock res = new TableRowsBlock();
        res.setTableRow(new TableRowsBlock.TableRow());
        res.getTableRow().setCells(cells);
        return res;
    }

    /**
     * 创建一个视频块
     *
     * @param url  视频地址
     * @param flog 是否为第三分托管文件
     * @return 视频块
     */
    public static Video creatVideo(String url, Boolean flog) {
        if (flog) {
            ExternalVideo externalVideo = new ExternalVideo();
            ExternalFile externalFile = new ExternalFile(true);
            externalFile.setExternal(new ExternalFile.External());
            externalFile.getExternal().setUrl(url);
            externalVideo.setVideo(externalFile);
            return externalVideo;
        } else {
            FileVideo fileVideo = new FileVideo();
            FileFile fileFile = new FileFile(true);
            fileFile.setFile(new FileFile.File());
            fileFile.getFile().setUrl(url);
            fileVideo.setVideo(fileFile);
            return fileVideo;
        }
    }

    /**
     * 创建一个书签块
     *
     * @param url     书签链接
     * @param caption 书签标题
     * @return 书签块
     */
    public static BookmarkBlock creatBookmarkBlock(String url, RichTextType[] caption) {
        BookmarkBlock res = new BookmarkBlock();
        res.setBookmark(new BookmarkBlock.Bookmark());
        res.getBookmark().setCaption(caption);
        res.getBookmark().setUrl(url);
        return res;
    }

    /**
     * 创建一个面包屑块
     *
     * @return 面包屑块
     */
    public static BreadcrumbBlock creatBreadcrumbBlock() {
        BreadcrumbBlock res = new BreadcrumbBlock();
        res.setBreadcrumb(new BreadcrumbBlock.Breadcrumb());
        return res;
    }

    /**
     * 创建一个列表块
     *
     * @param text     块中的富文本。
     * @param color    区块的颜色。{@link Color}
     * @param children 块的嵌套子块（如果有）。
     * @return 列表块
     */
    public static BulletedListItemBlock creatBulletedListItemBlock(RichTextType[] text, String color, BlockType[] children) {
        BulletedListItemBlock res = new BulletedListItemBlock();
        res.setBulletedListItem(new BulletedListItemBlock.BulletedListItem());
        res.getBulletedListItem().setRichText(text);
        res.getBulletedListItem().setColor(color);
        res.getBulletedListItem().setChildren(children);
        return res;
    }

    /**
     * 创建一个标注块
     *
     * @param text  块中的富文本。
     * @param icon  标注图标。{@link FileType}
     * @param color 区块的颜色。{@link Color}
     * @return 标注块
     */
    public static CalloutBlock creatCalloutBlock(RichTextType[] text, FileType icon, String color) {
        CalloutBlock res = new CalloutBlock();
        res.setCallout(new CalloutBlock.Callout());
        res.getCallout().setRichText(text);
        res.getCallout().setIcon(icon);
        res.getCallout().setColor(color);
        return res;
    }

    /**
     * 创建一个子数据库块
     *
     * @param title 子数据库标题
     * @return 子数据库块
     */
    public static ChildDatabaseBlock creatChildDatabaseBlock(String title) {
        ChildDatabaseBlock res = new ChildDatabaseBlock();
        res.setChildDatabase(new ChildDatabaseBlock.ChildDatabase());
        res.getChildDatabase().setTitle(title);
        return res;
    }

    /**
     * 创建一个子页面块
     *
     * @param title 子页面标题
     * @return 子页面块
     */
    public static ChildPageBlock creatChildPageBlock(String title) {
        ChildPageBlock res = new ChildPageBlock();
        res.setChildPage(new ChildPageBlock.ChildPage());
        res.getChildPage().setTitle(title);
        return res;
    }

    /**
     * 创建一个代码块
     *
     * @param caption  代码块标题中的富文本。
     * @param richText 代码块中的富文本。
     * @param language 代码块中包含的代码语言。{@link CodeLanguage}
     * @return 代码块
     */
    public static CodeBlock creatCodeBlock(RichTextType[] caption, RichTextType[] richText, String language) {
        CodeBlock res = new CodeBlock();
        res.setCode(new CodeBlock.Code());
        res.getCode().setCaption(caption);
        res.getCode().setRichText(richText);
        res.getCode().setLanguage(language);
        return res;
    }

    /**
     * 创建一个列块
     *
     * @param children 块的嵌套子块。
     * @return 列块
     */
    public static ColumnBlock creatColumnBlock(BlockType[] children) {
        ColumnBlock res = new ColumnBlock();
        res.setColumn(new ColumnBlock.Column());
        res.getColumn().setChildren(children);
        return res;
    }

    /**
     * 创建一个列表块
     *
     * @param children 列信息
     * @return 列表块
     */
    public static ColumnListBlock creatColumnListBlock(ColumnBlock[] children) {
        ColumnListBlock res = new ColumnListBlock();
        res.setColumnList(new ColumnListBlock.ColumnList());
        res.getColumnList().setChildren(children);
        return res;
    }

    /**
     * 创建一个分割线块
     *
     * @return 分割线块
     */
    public static DividerBlock creatDividerBlock() {
        DividerBlock res = new DividerBlock();
        res.setDivider(new DividerBlock.Divider());
        return res;
    }

    /**
     * 创建一个嵌入块
     *
     * @param url 嵌入块链接
     * @return 嵌入块
     */
    public static EmbedBlock creatEmbedBlock(String url) {
        EmbedBlock res = new EmbedBlock();
        res.setEmbed(new EmbedBlock.Embed());
        res.getEmbed().setUrl(url);
        return res;
    }

    /**
     * 创建一个公式块
     *
     * @param expression 公式表达式
     * @return 公式块
     */
    public static EquationBlock creatEquationBlock(String expression) {
        EquationBlock res = new EquationBlock();
        res.setEquation(new EquationBlock.Equation());
        res.getEquation().setExpression(expression);
        return res;
    }

    /**
     * 创建一个文件块
     *
     * @param file 文件信息
     * @return 文件块
     */
    public static FileBlock creatFileBlock(FileType file) {
        FileBlock res = new FileBlock();
        res.setFile(file);
        return res;
    }

    /**
     * 创建一个图像块
     *
     * @param file 图像信息
     * @return 图像块
     */
    public static ImageBlock creatImageBlock(FileType file) {
        ImageBlock res = new ImageBlock();
        res.setImage(file);
        return res;
    }

    /**
     * 创建一个链接预览块
     *
     * @param url 链接地址
     * @return 链接预览块
     */
    public static LinkPreviewBlock creatLinkPreviewBlock(String url) {
        LinkPreviewBlock res = new LinkPreviewBlock();
        res.setLinkPreview(new LinkPreviewBlock.LinkPreview());
        res.getLinkPreview().setUrl(url);
        return res;
    }

    /**
     * 创建一个编号列表项目块
     *
     * @param richText 块中显示的富文本。
     * @param color    区块的颜色。{@link Color}
     * @param children 块的嵌套子块（如果有）。
     * @return 编号列表项目块
     */
    public static NumberedListItemBlock creatNumberedListItemBlock(RichTextType[] richText, String color, BlockType[] children) {
        NumberedListItemBlock res = new NumberedListItemBlock();
        res.setNumberedListItem(new NumberedListItemBlock.NumberedListItem());
        res.getNumberedListItem().setRichText(richText);
        res.getNumberedListItem().setColor(color);
        res.getNumberedListItem().setChildren(children);
        return res;
    }

    /**
     * 创建一个段落块
     *
     * @param richText 块中显示的富文本。
     * @param color    区块的颜色。{@link Color}
     * @param children 块的嵌套子块（如果有）。
     * @return 段落块
     */
    public static ParagraphBlock creatParagraphBlock(RichTextType[] richText, String color, BlockType[] children) {
        ParagraphBlock res = new ParagraphBlock();
        res.setParagraph(new ParagraphBlock.Paragraph());
        res.getParagraph().setRichText(richText);
        res.getParagraph().setColor(color);
        res.getParagraph().setChildren(children);
        return res;
    }

    /**
     * 创建一个引用块
     *
     * @param richText 块中显示的富文本。
     * @param color    区块的颜色。{@link Color}
     * @param children 块的嵌套子块（如果有）。
     * @return 引用块
     */
    public static QuoteBlock creatQuoteBlock(RichTextType[] richText, String color, BlockType[] children) {
        QuoteBlock res = new QuoteBlock();
        res.setQuote(new QuoteBlock.Quote());
        res.getQuote().setRichText(richText);
        res.getQuote().setColor(color);
        res.getQuote().setChildren(children);
        return res;
    }

    /**
     * 创建一个目录块
     *
     * @param color 区块的颜色。{@link Color}
     * @return 目录块
     */
    public static TableOfContentsBlock creatTableOfContentsBlock(String color) {
        TableOfContentsBlock res = new TableOfContentsBlock();
        res.setTableOfContents(new TableOfContentsBlock.TableOfContents());
        res.getTableOfContents().setColor(color);
        return res;
    }

    /**
     * 创建一个待办事项块
     *
     * @param richText 待办事项区块中显示的富文本。
     * @param checked  是否选中待办事项。
     * @param color    区块的颜色。
     * @param children 嵌套子块（如果有）。
     * @return 待办事项块
     */
    public static ToDoBlock creatToDoBlock(RichTextType[] richText, Boolean checked, String color, BlockType[] children) {
        ToDoBlock res = new ToDoBlock();
        res.setToDo(new ToDoBlock.ToDo());
        res.getToDo().setRichText(richText);
        res.getToDo().setChecked(checked);
        res.getToDo().setColor(color);
        res.getToDo().setChildren(children);
        return res;
    }

    /**
     * 创建一个切换块
     *
     * @param richText 块中显示的富文本。
     * @param color    区块的颜色。{@link Color}
     * @param children 块的嵌套子块（如果有）。
     * @return 切换块
     */
    public static ToggleBlock creatToggleBlock(RichTextType[] richText, String color, BlockType[] children) {
        ToggleBlock res = new ToggleBlock();
        res.setToggle(new ToggleBlock.Toggle());
        res.getToggle().setRichText(richText);
        res.getToggle().setColor(color);
        res.getToggle().setChildren(children);
        return res;
    }

}
