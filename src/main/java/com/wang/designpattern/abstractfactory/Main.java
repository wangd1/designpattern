package com.wang.designpattern.abstractfactory;

import com.wang.designpattern.abstractfactory.model.Department;
import com.wang.designpattern.abstractfactory.model.User;
import com.wang.designpattern.abstractfactory.mysql.MySqlFactory;

public class Main {
    public static void main(String[] args) {
        // IFactory factory = new MySqlFactory();
        // IUser user = factory.createUser();
        // user.addUser(new User());
        //
        // IDepartment department = factory.createDepartment();
        // department.getDepartmentById("");

        IUser user = DataAccess.createUser();
        User user1 = user.getUser("1");
        IDepartment department = DataAccess.createDepartment();
        Department departmentById = department.getDepartmentById("1");
    }
}
