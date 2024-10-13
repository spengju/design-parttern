package com.peng.pattern.abstractFactory.impl;


import com.peng.pattern.abstractFactory.ICommand;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/13 17:03
 * @Desc:
 */
public class MySqlCommand implements ICommand {
    @Override
    public String getCommand() {
        return "MySql Command";
    }
}
