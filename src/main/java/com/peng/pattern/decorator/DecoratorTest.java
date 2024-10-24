package com.peng.pattern.decorator;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/24 22:39
 * @Desc: 装饰器模式
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Component component=new ConcreteComponent();
        component.operation();
        System.out.println("------------");
        Component component2=new ConcreteDecorator(component);
        component2.operation();
        System.out.println("-----------");
        Component component3=new ConcreteDecorator2(component2);
        component3.operation();
    }
}
