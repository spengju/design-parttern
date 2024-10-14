package com.peng.pattern.builder.v2;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/13 17:52
 * @Desc:
 */
public class Test {
    public static void main(String[] args) {
        User.Builder builder = new User.Builder();
        builder.username("spengju")
                .email("spengju0211@gmail.com")
                .role("admin")
                .code("123")
                .address("china");
        User user = builder.build();
        System.out.println(user);
    }
}
