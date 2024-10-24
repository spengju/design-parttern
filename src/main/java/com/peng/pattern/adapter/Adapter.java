package com.peng.pattern.adapter;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/24 22:34
 * @Desc:
 */
public class Adapter {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public int print5(){
        return this.adaptee.print220();
    }
}
