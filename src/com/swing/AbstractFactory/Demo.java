package com.swing.AbstractFactory;

/**
 * Created by swing on 2016/7/6.
 */
public class Demo {

    public static void main(String[] args) {
        HaierFactory haierFactory = new HaierFactory();
        Fridge blueFrige;
        Oven greyOven;
        blueFrige = haierFactory.makeFridge();
        System.out.println("--------loading---------");
        blueFrige.setName("海尔蓝色超静音冰箱");
        blueFrige.setPrice("$500");
        System.out.println("名称：" + blueFrige.getName() + "，售价：" + blueFrige.getPrice());
        System.out.println("--------process---------");
        blueFrige.refrigeration();

        greyOven = haierFactory.makeOven();
        System.out.println("--------loading---------");
        greyOven.setName("海尔灰色大功率烤炉");
        greyOven.setPrice("$200");
        System.out.println("名称：" + greyOven.getName() + "，售价：" + greyOven.getPrice());
        System.out.println("--------process---------");
        greyOven.broil();




    }
}
