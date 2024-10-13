package com.peng.pattern.abstractFactory;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/13 16:49
 * @Desc:
 */
public interface IDataBase {
    IConnection getConnection();

    ICommand getCommand();
}
