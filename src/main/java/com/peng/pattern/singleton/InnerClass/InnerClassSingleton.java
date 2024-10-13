package com.peng.pattern.singleton.InnerClass;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/13 14:38
 * @Desc: 静态内部类
 * 利用类的加载机制来保证线程安全
 * 只有在真正使用对应的类时，才会触发初始化
 */
public class InnerClassSingleton implements Serializable {

    static final long serialVersionUID = 42L;

    class InnerClassHolder {
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    public InnerClassSingleton() {
        if (InnerClassHolder.instance != null) {
            throw new RuntimeException("单例不允许多个实例");
        }
    }

    public static InnerClassSingleton getInstance() {
        return InnerClassHolder.instance;
    }

    /**
     * 不加这个，从文件读取到序列化流会导致和代码的不一样
     * @return
     * @throws ObjectStreamException
     */
    Object readResolve() throws ObjectStreamException {
        return InnerClassHolder.instance;
    }


}
