package com.peng.pattern.chainOfResponsibility;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/26 16:37
 * @Desc:
 */
public class RequestFrequentHandler extends Handler {
    public RequestFrequentHandler(Handler next) {
        super(next);
    }

    @Override
    boolean process(Request request) {
        System.out.println("访问频率控制...");
        if (request.isFrequentOk()) {
            Handler next = getNext();
            if (null == next) {
                return true;
            }
            if (!next.process(request)) {
                return false;
            } else {
                return true;
            }
        }

        return false;

    }
}
