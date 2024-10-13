package com.peng.pattern.singleton.hungerSingleton;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/13 13:46
 * @Desc: 饿汉模式：类加载的 初始化阶段就完成 实例的初始化
 *  1、加载二进制数据到内存中， 生成对应的Class数据结构，
 *  2、连接： a. 验证， b.准备（给类的静态成员变量赋默认值），c.解析
 *  3、初始化： 给类的静态变量赋初值
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return instance;
    }
}
