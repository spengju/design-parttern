package com.peng.pattern.flyweight;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/15 23:06
 * @Desc: 享元模式
 */
public class FlyweightTest {
    public static void main(String[] args) {
        UserNode spengju = new UserNode(3, 4, UserFactory.getUser("spengju", "111@qq.com"));
        UserNode spengju1 = new UserNode(1, 4, UserFactory.getUser("spengju", "222@qq.com"));
        UserNode spengju2 = new UserNode(3, 5, UserFactory.getUser("spengju", "333@qq.com"));

    }
}
