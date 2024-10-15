package com.peng.pattern.flyweight;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/15 23:07
 * @Desc:
 */
public class User {
    private final String username;
    private final String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }


    public String getEmail() {
        return email;
    }

}
