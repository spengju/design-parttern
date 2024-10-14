package com.peng.pattern.builder;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/13 17:24
 * @Desc:
 */
public interface UserBuilder {
    void builderUsername(String username);

    void builderEmail(String email);

    void builderAddress(String address);

    void builderCode(String code);

    void builderRole(String role);

    User build();
}
