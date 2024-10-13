package com.peng.pattern.factory;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/13 16:05
 * @Desc: 工厂方法: 将方法拆成接口或抽象出来,让子类去实现或继承,提供统一的获取方法
 *          1.不知道改使用对象的确切类型的时候
 *          2.希望为库或框架提供扩展其内部组件的方法时
 */
public class Test {
    public static void main(String[] args) {
        Product product = ProductFactory.getProduct("red");
        Product product2 = ProductFactory.getProduct("black");
        System.out.println(product.getProduct());
        System.out.println(product2.getProduct());
    }
}
