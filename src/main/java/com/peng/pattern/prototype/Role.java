package com.peng.pattern.prototype;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/15 22:50
 * @Desc:
 */
public class Role implements Cloneable{
    private String rolename;

    public Role(String rolename) {
        this.rolename = rolename;
    }

    @Override
    protected Role clone() throws CloneNotSupportedException {
        Role clone = (Role) super.clone();
        return clone;
    }
}
