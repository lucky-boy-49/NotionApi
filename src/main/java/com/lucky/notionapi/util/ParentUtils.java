package com.lucky.notionapi.util;

import com.lucky.notionapi.model.parent.type.BlockParent;
import com.lucky.notionapi.model.parent.type.DatabaseParent;
import com.lucky.notionapi.model.parent.type.PageParent;
import com.lucky.notionapi.model.parent.type.WorkspaceParent;

/**
 * 父信息工具类
 *
 * @author jiahe
 */
public class ParentUtils {

    /**
     * 创建块父级
     *
     * @param blockId 父级块ID
     * @return 块父级
     */
    public static BlockParent creatBlockParent(String blockId) {
        BlockParent res = new BlockParent(true);
        res.setBlockId(blockId);
        return res;
    }

    /**
     * 创建数据库父级
     *
     * @param databaseId 父级数据库ID
     * @return 数据库父级
     */
    public static DatabaseParent creatDatabaseParent(String databaseId) {
        DatabaseParent res = new DatabaseParent(true);
        res.setDatabaseId(databaseId);
        return res;
    }

    /**
     * 创建页面父级
     *
     * @param pageId 父级页面ID
     * @return 页面父级
     */
    public static PageParent creatPageParent(String pageId) {
        PageParent res = new PageParent(true);
        res.setPageId(pageId);
        return res;
    }

    /**
     * 创建工作空间父级
     *
     * @return 工作空间父级
     */
    public static WorkspaceParent creatWorkspaceParent() {
        return new WorkspaceParent(true);
    }

}
