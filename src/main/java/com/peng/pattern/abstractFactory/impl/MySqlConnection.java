package com.peng.pattern.abstractFactory.impl;

import com.peng.pattern.abstractFactory.IConnection;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/13 17:03
 * @Desc:
 */
public class MySqlConnection implements IConnection {
    @Override
    public String getConnection() {
        return "MySql Connection";
    }
}
