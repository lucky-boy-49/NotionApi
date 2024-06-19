package com.lucky.notionapi.util;

import org.junit.jupiter.api.Test;

class ParentUtilsTest {

    @Test
    void creatBlockParent() {
        System.out.println(ParentUtils.creatBlockParent("dafeafefa"));
    }

    @Test
    void creatDatabaseParent() {
        System.out.println(ParentUtils.creatDatabaseParent("dafeafefa"));
    }

    @Test
    void creatPageParent() {
        System.out.println(ParentUtils.creatPageParent("dafeafefa"));
    }

    @Test
    void creatWorkspaceParent() {
        System.out.println(ParentUtils.creatWorkspaceParent());
    }
}