package com.peng.pattern.singleton.lazySingleton;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/13 13:06
 * @Desc: 懒汉模式测试
 */
public class LazySingletonTest {
    public static void main(String[] args) {
//        CountDownLatch countDownLatch = new CountDownLatch(1);
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                try {
//                    countDownLatch.await();
                    System.out.println(Thread.currentThread().getName() + ": " + LazySingleton.getInstance());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }, "thread-" + i).start();
        }
//        try {
//            TimeUnit.SECONDS.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        countDownLatch.countDown();
    }
}
