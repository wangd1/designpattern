package com.wang.designpattern.abstractfactory.oracle;

import com.wang.designpattern.abstractfactory.IDepartment;
import com.wang.designpattern.abstractfactory.IFactory;
import com.wang.designpattern.abstractfactory.IUser;

public class OracleFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new OracleUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new OracleDepartment();
    }
}
