package com.peng.pattern.factory;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/13 16:25
 * @Desc:
 */
public class ProductFactory {
    public static Product getProduct(String type){
        switch (type){
            case "black":
               return new BlackCar();
            case "red":
                return new RedCar();
            default:
                return new BlackCar();
        }
    }
}
