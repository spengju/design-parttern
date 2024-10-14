package com.peng.pattern.builder;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/13 17:21
 * @Desc:
 */
public class builderTest {
    public static void main(String[] args) {
//        User user = new User();
        UserBuilder builder = new DefaultConCreateUserBuilder();
        UserBuilder user2ConCreateUserBuilder = new User2ConCreateUserBuilder();
        Director director = new Director(builder);
        User user = director.makeUser("spengju", "spengju0211@gmail.com", "cn", "123", "admin");
        System.out.println(user);
    }
}
