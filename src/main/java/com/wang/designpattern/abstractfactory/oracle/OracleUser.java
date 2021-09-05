package com.wang.designpattern.abstractfactory.oracle;

import com.wang.designpattern.abstractfactory.IUser;
import com.wang.designpattern.abstractfactory.model.User;

public class OracleUser implements IUser {
    @Override
    public void addUser(User user) {
        System.out.println("新增oracle用户");
    }

    @Override
    public User getUser(String id) {
        System.out.println("根据id获取oracle用户");
        return null;
    }
}
