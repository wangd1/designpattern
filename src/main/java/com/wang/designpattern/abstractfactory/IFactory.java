package com.wang.designpattern.abstractfactory;

public interface IFactory {
    IUser createUser();
    IDepartment createDepartment();
}
