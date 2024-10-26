package com.peng.pattern.strategy;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/24 23:01
 * @Desc:
 */
public class WhitePeople extends People{
    @Override
    void eat() {
        System.out.println("白人主食吃汉堡");
    }
}
