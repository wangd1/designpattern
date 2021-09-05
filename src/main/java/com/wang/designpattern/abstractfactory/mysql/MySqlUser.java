package com.wang.designpattern.abstractfactory.mysql;

import com.wang.designpattern.abstractfactory.IUser;
import com.wang.designpattern.abstractfactory.model.User;

public class MySqlUser implements IUser {
    @Override
    public void addUser(User user) {
        System.out.println("新增mysql用户");
    }

    @Override
    public User getUser(String id) {
        System.out.println("根据id获取mysql用户");
        return null;
    }
}
