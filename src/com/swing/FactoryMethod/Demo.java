package com.swing.FactoryMethod;

/**
 * Created by swing on 2016/7/5.
 */
public class Demo {

    public static void main(String[] args) {

        /**
         * 增加一条文件日志
         */
        FileLogFactory fileLogFactory = new FileLogFactory();
        Log filelog = fileLogFactory.create();
        filelog.addLog();


        /**
         * 增加一条数据库日志
         */
        DatabaseLogFactory databaseLogFactory = new DatabaseLogFactory();
        Log databaselog = databaseLogFactory.create();
        databaselog.addLog();

    }
}
