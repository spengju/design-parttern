package com.peng.pattern.flyweight;


/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/15 23:08
 * @Desc:
 */
public class UserNode {
    private int x;

    private int y;

    private User user;

    public UserNode(int x, int y, User user) {
        this.x = x;
        this.y = y;
        this.user = user;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
