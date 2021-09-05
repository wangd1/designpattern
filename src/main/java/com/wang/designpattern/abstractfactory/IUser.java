package com.wang.designpattern.abstractfactory;

import com.wang.designpattern.abstractfactory.model.User;

public interface IUser {
    void addUser(User user);
    User getUser(String id);
}
