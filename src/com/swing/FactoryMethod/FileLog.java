package com.swing.FactoryMethod;

/**
 * Created by swing on 2016/7/5.
 * 文件类型的日志
 */
public class FileLog implements Log{

    @Override
    public void addLog() {
        System.out.println("增加了一条文件日志");
    }

    @Override
    public void delLog() {
        System.out.println("删除了一条文件日志");
    }
}
