package com.peng.pattern.decorator;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/24 22:40
 * @Desc:
 */
public class ConcreteComponent implements Component{
    @Override
    public void operation() {
        System.out.println("拍照功能");
    }
}
