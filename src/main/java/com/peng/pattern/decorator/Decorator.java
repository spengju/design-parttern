package com.peng.pattern.decorator;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/24 22:40
 * @Desc:
 */
public abstract class Decorator implements Component {
    Component component;

    public Decorator(Component component) {
        this.component = component;
    }
}
