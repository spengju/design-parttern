package com.peng.pattern.templateMethod;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/26 15:45
 * @Desc: 模版方法模式
 */
public class TemplateMethodTest {
    public static void main(String[] args) {
        AbstractClass abstractClass=new SubClass();
        abstractClass.operation();
    }
}
