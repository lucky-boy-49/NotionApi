package com.lucky.notionapi.enumerate;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 块类型枚举
 * @author jiahe
 */
@Getter
@RequiredArgsConstructor
public enum BlockType {

    /**
     * 书签
     */
    BOOKMARK("bookmark"),
    /**
     * 面包屑
     */
    BREADCRUMB("breadcrumb"),
    /**
     * 项目符号列表项
     */
    BULLETED_LIST_ITEM("bulleted_list_item"),
    /**
     * 意见
     */
    CALLOUT("callout"),
    /**
     * 子数据库
     */
    CHILD_DATABASE("child_database"),
    /**
     * 子页面
     */
    CHILD_PAGE("child_page"),
    /**
     * 代码块
     */
    CODE("code"),
    /**
     * 列表
     */
    COLUMN_LIST("column_list"),
    /**
     * 列
     */
    COLUMN("column"),
    /**
     * 分频器
     */
    DIVIDER("divider"),
    /**
     * 嵌入
     */
    EMBED("embed"),
    /**
     * 方程
     */
    EQUATION("equation"),
    /**
     * 文件
     */
    FILE("file"),
    /**
     * 标题1
     */
    HEADING_1("heading_1"),
    /**
     * 标题2
     */
    HEADING_2("heading_2"),
    /**
     * 标题3
     */
    HEADING_3("heading_3"),
    /**
     * 图像
     */
    IMAGE("image"),
    /**
     * 链接预览
     */
    LINK_PREVIEW("link_preview"),
    /**
     * 编号列表项
     */
    NUMBERED_LIST_ITEM("numbered_list_item"),
    /**
     * 段落
     */
    PARAGRAPH("paragraph"),
    /**
     * PDF
     */
    PDF("pdf"),
    /**
     * 引用
     */
    QUOTE("quote"),
    /**
     * 同步块
     */
    SYNCED_BLOCK("synced_block"),
    /**
     * 表格
     */
    TABLE("table"),
    /**
     * 目录
     */
    TABLE_OF_CONTENTS("table_of_contents"),
    /**
     * 任务
     */
    TO_DO("to_do"),
    /**
     * 切换
     */
    TOGGLE("toggle"),
    /**
     * 视频
     */
    VIDEO("video");

    private final String type;

}
