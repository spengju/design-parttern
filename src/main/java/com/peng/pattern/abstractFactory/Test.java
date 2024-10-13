package com.peng.pattern.abstractFactory;

import com.peng.pattern.abstractFactory.impl.MysqlDb;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/13 16:52
 * @Desc: 抽象工厂模式：提供一个创建一系列相关或互相依赖对象的接口，而无需指定它们具体的类
 */
public class Test {
    public static void main(String[] args) {
        IDataBase db=new MysqlDb();
        IConnection connection = db.getConnection();
        ICommand command = db.getCommand();
        System.out.println(connection.getConnection());
        System.out.println(command.getCommand());
    }
}
