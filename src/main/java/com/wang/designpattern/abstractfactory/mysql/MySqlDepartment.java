package com.wang.designpattern.abstractfactory.mysql;

import com.wang.designpattern.abstractfactory.IDepartment;
import com.wang.designpattern.abstractfactory.model.Department;

public class MySqlDepartment implements IDepartment {
    @Override
    public void addDepartment() {
        System.out.println("新增mysql部门");
    }

    @Override
    public Department getDepartmentById(String id) {
        System.out.println("根据id获取mysql部门");
        return null;
    }
}
