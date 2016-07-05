package com.swing.FactoryMethod;

/**
 * Created by swing on 2016/7/5.
 *
 * 数据库日志工厂
 */
public class DatabaseLogFactory implements Factory{

    @Override
    public Log create() {
        DatabaseLog databaseLog = new DatabaseLog();
        return databaseLog;
    }
}
