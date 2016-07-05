package com.swing.FactoryMethod;

/**
 * Created by swing on 2016/7/5.
 *
 * 文件日志工厂
 */
public class FileLogFactory implements Factory{

    @Override
    public Log create() {
        FileLog fileLog = new FileLog();
        return fileLog;
    }
}
