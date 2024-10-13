package com.peng.pattern.singleton.InnerClass;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/13 14:43
 * @Desc:
 */
public class InnerClassSingletonTest {
    public static void main(String[] args) {
        System.out.println(InnerClassSingleton.getInstance());
        System.out.println(InnerClassSingleton.getInstance());
    }
}
