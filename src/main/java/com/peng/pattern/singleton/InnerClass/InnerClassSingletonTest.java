package com.peng.pattern.singleton.InnerClass;

import java.io.*;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/13 14:43
 * @Desc:
 */
public class InnerClassSingletonTest {
    public static void main(String[] args) throws Exception {
        InnerClassSingleton instance = InnerClassSingleton.getInstance();
        System.out.println(instance);
//        System.out.println(InnerClassSingleton.getInstance());
//        System.out.println(InnerClassSingleton.getInstance());
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("testInstance"));
//        objectOutputStream.writeObject(instance);
//        objectOutputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("testInstance"));
        InnerClassSingleton object = ((InnerClassSingleton) inputStream.readObject());
        inputStream.close();
        System.out.println(object);
    }
}
