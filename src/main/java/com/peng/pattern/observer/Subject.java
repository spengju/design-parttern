package com.peng.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/26 16:09
 * @Desc:
 */
public class Subject {
    private List<Observer> container = new ArrayList();

    public void add(Observer observer) {
        container.add(observer);
    }

    public void remove(Observer observer) {
        container.remove(observer);
    }

    public void notifyObserver(Object object){
        for (Observer item : container) {
            item.update(object);
        }
    }
}
