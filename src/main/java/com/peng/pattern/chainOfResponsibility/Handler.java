package com.peng.pattern.chainOfResponsibility;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/26 16:35
 * @Desc:
 */
public abstract class Handler {
    Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    abstract boolean process(Request request);
}
