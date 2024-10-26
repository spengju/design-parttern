package com.peng.pattern.strategy;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/24 23:00
 * @Desc:
 */
public abstract class People {

    abstract void eat();

    void canSleep() {
        System.out.println("睡觉");
    }
}
