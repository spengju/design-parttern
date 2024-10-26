package com.peng.pattern.observer;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/26 16:12
 * @Desc:
 */
public class Task1 implements Observer {
    @Override
    public void update(Object object) {
        System.out.println("task1 receive:" + object);
    }
}
