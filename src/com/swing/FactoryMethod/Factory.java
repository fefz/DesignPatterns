package com.swing.FactoryMethod;

/**
 * Created by swing on 2016/7/5.
 *
 * 核心工厂类，只是提供一个接口，产品的创建交给具体产品的工厂类实现。
 */
interface Factory {
    Log create();
}
