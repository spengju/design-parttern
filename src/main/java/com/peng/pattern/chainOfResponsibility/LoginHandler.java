package com.peng.pattern.chainOfResponsibility;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/26 16:40
 * @Desc:
 */
public class LoginHandler extends Handler{
    public LoginHandler(Handler next) {
        super(next);
    }

    @Override
    boolean process(Request request) {
        System.out.println("登陆验证...");
        if (request.isLoggedOn()) {
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
