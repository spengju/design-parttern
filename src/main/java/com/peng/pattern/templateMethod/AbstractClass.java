package com.peng.pattern.templateMethod;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/26 15:45
 * @Desc:
 */
public abstract class AbstractClass {
    public void operation() {
        System.out.println("pre...");
        System.out.println("step1...");
        System.out.println("step2...");
        templateMethod();
    }
    abstract void templateMethod();
}
