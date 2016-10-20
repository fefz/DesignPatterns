package com.swing.Thread;

/**
 * Created by swing on 2016/10/13.
 */
public class Counter {

    long count = 0;
    public synchronized void add(long num){
        this.count += num;
    }
}
