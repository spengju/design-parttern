package com.peng.pattern.decorator;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/24 22:41
 * @Desc:
 */
public class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        component.operation();
        System.out.println("添加美颜效果");
    }
}
