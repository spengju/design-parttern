package com.peng.pattern.builder;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/13 17:29
 * @Desc:
 */
public class Director {
    private UserBuilder builder;

    public Director(UserBuilder builder) {
        this.builder = builder;
    }

    public User makeUser(String username, String email, String address, String code, String role) {
        builder.builderUsername(username);
        builder.builderAddress(address);
        builder.builderCode(code);
        builder.builderEmail(email);
        builder.builderRole(role);
        return builder.build();
    }
}
