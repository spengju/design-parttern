package com.peng.pattern.strategy;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/24 22:59
 * @Desc: 策略模式
 */
public class StrategyTest {
    public static void main(String[] args) {
        People asiaPeople=new AsiaPeople();
        People whitePeople=new WhitePeople();
        asiaPeople.canSleep();
        asiaPeople.eat();
        whitePeople.canSleep();
        whitePeople.eat();
    }
}
