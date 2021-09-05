package com.wang.designpattern.abstractfactory.mysql;

import com.wang.designpattern.abstractfactory.IDepartment;
import com.wang.designpattern.abstractfactory.IFactory;
import com.wang.designpattern.abstractfactory.IUser;

public class MySqlFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new MySqlUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new MySqlDepartment();
    }
}
