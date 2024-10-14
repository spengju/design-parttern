package com.peng.pattern.builder;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/13 17:27
 * @Desc:
 */
public class User2ConCreateUserBuilder implements UserBuilder {
    private String username;
    private String email;
    private String address;
    private String code;
    private String role;

    @Override
    public void builderUsername(String username) {
        this.username = username;
    }

    @Override
    public void builderEmail(String email) {
        this.email = email;
    }

    @Override
    public void builderAddress(String address) {
        this.address = address;
    }

    @Override
    public void builderCode(String code) {
        this.code = code;
    }

    @Override
    public void builderRole(String role) {
        this.role = role;
    }

    @Override
    public User build() {
        return new User(this.username, this.email, this.address, this.code, this.role);
    }
}
