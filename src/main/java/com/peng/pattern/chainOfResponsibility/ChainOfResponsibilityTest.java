package com.peng.pattern.chainOfResponsibility;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/26 16:28
 * @Desc: 责任链模式
 */
public class ChainOfResponsibilityTest {
    public static void main(String[] args) {
        Request request = new Request.RequestBuilder()
                .frequentOk(true)
                .isPermit(true)
                .loggedOn(true).build();
        RequestFrequentHandler handler = new RequestFrequentHandler(new LoginHandler(null));
        System.out.println(handler.process(request));


    }
}
