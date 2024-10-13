package com.peng.pattern.abstractFactory.impl;

import com.peng.pattern.abstractFactory.ICommand;
import com.peng.pattern.abstractFactory.IConnection;
import com.peng.pattern.abstractFactory.IDataBase;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/13 16:51
 * @Desc:
 */
public class MysqlDb implements IDataBase {
    @Override
    public IConnection getConnection() {
        return new MySqlConnection();
    }

    @Override
    public ICommand getCommand() {
        return new MySqlCommand();
    }
}
