package com.peng.pattern.observer;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/26 16:08
 * @Desc: 观察者模式
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        subject.add(task1);
        subject.add(task2);
        subject.notifyObserver("xxx");
        System.out.println("---------------");
        subject.remove(task1);
        subject.notifyObserver("************");
    }
}
