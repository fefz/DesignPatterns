package com.swing.AbstractFactory;

/**
 * Created by swing on 2016/7/6.
 */
public class HaierFactory implements AbstractFactory{

    @Override
    public Fridge makeFridge() {
        System.out.println("制造一个海尔牌的冰箱");
        return new HaierFridge();
    }

    @Override
    public Oven makeOven() {
        System.out.println("制造一个海尔牌的烤箱");
        return new HaierOven();
    }
}
