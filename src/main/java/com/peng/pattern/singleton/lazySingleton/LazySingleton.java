package com.peng.pattern.singleton.lazySingleton;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/13 12:59
 * @Desc: 单例模式:保证一个类只有一个实例，并且提供一个全局访问点
 *        懒汉模式：延迟加载,只有在真正使用的时候，才开始实例化。
 *                  1）线程安全问题
 *                  2）double check 加锁优化
 *                  3）指令重排序:编译器(JIT),CPU 有可能对指令进行重排序，导致使用到尚未初始化的实例
 */
public class LazySingleton {
//    private static LazySingleton instance;

    //volatile:禁止指令重排序
    private volatile static LazySingleton instance;

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public static LazySingleton getInstanceByDCL() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    /**
                     * 正常情况下这行代码会经过:
                     *  1. 分配对象内存空间
                     *  2.初始化对象
                     *  3.设置instance指向刚刚分配的内存地址
                     * 如果发生指令重排，执行顺序可能为:1、3、2
                     *      如果A线程执行到3，此时线程2执行getInstanceByDCL()判断instance是不为空的,会直接返回未初始化的instance导致空指针
                     */
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

}
