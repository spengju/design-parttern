package com.peng.pattern.prototype;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/15 22:55
 * @Desc:
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Role role = new Role("role");
        User user = new User("spengju", "xxx@qq.com", role);
        User clone = user.clone();
        User clone2 = user.clone();
        System.out.println(user);
        System.out.println(user.getUsername());
        System.out.println(clone);
        System.out.println(clone.getUsername());
        System.out.println(clone2);
        System.out.println(clone2.getUsername());

    }
}
