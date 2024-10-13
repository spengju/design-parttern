package com.peng.pattern.singleton.hungerSingleton;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/13 14:34
 * @Desc:
 */
public class HungrySingletonTest {
    public static void main(String[] args) {
        System.out.println(HungrySingleton.getInstance());
        System.out.println(HungrySingleton.getInstance());
        System.out.println(HungrySingleton.getInstance());
    }
}
