package com.swing.AbstractFactory;

/**
 * Created by swing on 2016/7/5.
 *
 * 冰箱工厂
 */
public abstract class Fridge {
    String name;
    String price;
    abstract void refrigeration();//冷藏

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
}
