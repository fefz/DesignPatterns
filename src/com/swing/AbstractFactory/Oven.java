package com.swing.AbstractFactory;

/**
 * Created by swing on 2016/7/5.
 *
 * 烤箱工厂
 */
public abstract class Oven {
    String name;
    String price;
    abstract void broil();//烧烤

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
