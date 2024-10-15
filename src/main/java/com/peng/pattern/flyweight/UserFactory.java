package com.peng.pattern.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/15 23:09
 * @Desc:
 */
public class UserFactory {
    public static Map<String, User> map = new ConcurrentHashMap<>();

    public static User getUser(String username, String email) {
        System.out.println("name:" + username + " email:" + email);
        if (map.containsKey(username)) {
            return map.get(username);
        }
        User user = new User(username, email);
        map.put(username, user);
        return user;
    }
}
