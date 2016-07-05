package com.swing.FactoryMethod;

/**
 * Created by swing on 2016/7/5.
 */
public class DatabaseLog implements Log {

    @Override
    public void addLog() {
        System.out.println("增加了一条数据库日志");
    }

    @Override
    public void delLog() {
        System.out.println("删除了一条数据库日志");
    }
}
