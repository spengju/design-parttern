package com.peng.pattern.decorator;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/24 22:44
 * @Desc:
 */
public class ConcreteDecorator2 extends Decorator{
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("滤镜功能");
        component.operation();
    }
}
