package com.peng.pattern.adapter;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/24 22:15
 * @Desc: 适配器模式
 */
public class AdapterTest {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new Adaptee());
        System.out.println(adapter.print5());

    }
}
