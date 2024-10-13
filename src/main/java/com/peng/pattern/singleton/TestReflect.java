package com.peng.pattern.singleton;

import com.peng.pattern.singleton.InnerClass.InnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/13 14:45
 * @Desc:
 */
public class TestReflect {
    public static void main(String[] args) throws  Exception {
        InnerClassSingleton instance = InnerClassSingleton.getInstance();
        System.out.println(instance);

        Constructor<InnerClassSingleton> constructor = InnerClassSingleton.class.getConstructor();
        constructor.setAccessible(true);
        InnerClassSingleton innerClassSingleton = constructor.newInstance();
        System.out.println(innerClassSingleton);

    }
}
