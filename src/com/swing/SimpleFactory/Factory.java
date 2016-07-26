package com.swing.SimpleFactory;

/**
 * Created by swing on 2016/7/4.
 * 根据传递的参数创建不同的产品
 */
public class Factory {

    public Product getType(String type ){
        if(type == null){
            return null;
        }

        if (type.equals("car")){
            return new Car();
        }
        else if(type.equals("truck")){
            return new Truck();
        }
        return null;
    }
}
