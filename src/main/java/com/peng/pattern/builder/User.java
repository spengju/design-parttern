package com.peng.pattern.builder;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/13 17:20
 * @Desc:
 */
public class User {
    private String username;
    private String email;
    private String address;
    private String code;
    private String role;

    public User() {
    }

    public User(String username, String email, String address, String code, String role) {
        this.username = username;
        this.email = email;
        this.address = address;
        this.code = code;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", code='" + code + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
