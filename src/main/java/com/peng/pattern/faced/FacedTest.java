package com.peng.pattern.faced;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/15 23:31
 * @Desc: 门面模式
 */
public class FacedTest {
    Sys1 sys1 = new Sys1();
    Sys2 sys2 = new Sys2();
    Sys3 sys3 = new Sys3();
    public static void main(String[] args) {
        FacedTest facedTest = new FacedTest();
        facedTest.doSomething();
    }

    public void doSomething(){
        sys1.test1();
        sys2.test2();
        sys3.test3();
    }
}
