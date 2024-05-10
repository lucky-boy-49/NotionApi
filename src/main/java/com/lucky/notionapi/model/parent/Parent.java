package com.lucky.notionapi.model.parent;

/**
 * 页面、数据库和块要么位于其他页面、数据库和块内部，要么位于工作区的顶层。该位置称为“父位置”。父级信息由整个 API 中一致的 parent 对象表示。
 * 1.页面可以由其他页面、数据库、块或整个工作区作为父级。
 * 2.块可以由页面、数据库或块作为父级。
 * 3.数据库可以按页面、块或整个工作区作为父级。
 * @author jiahe
 */
public interface Parent {

    /**
     * 获取“家长”的类型
     * @return 类型
     */
    String getType();

}
