package com.peng.pattern.prototype;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/15 22:50
 * @Desc:
 */
public class User implements Cloneable {
    private String username;
    private String email;

    private Role role;

    public User(String username, String email, Role role) {
        this.username = username;
        this.email = email;
        this.role = role;
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        User clone = (User) super.clone();
        clone.setRole(this.role.clone());
        return clone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
