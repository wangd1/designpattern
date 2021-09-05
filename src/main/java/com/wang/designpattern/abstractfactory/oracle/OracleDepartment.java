package com.wang.designpattern.abstractfactory.oracle;

import com.wang.designpattern.abstractfactory.IDepartment;
import com.wang.designpattern.abstractfactory.model.Department;

public class OracleDepartment implements IDepartment {
    @Override
    public void addDepartment() {
        System.out.println("新增oracle部门");
    }

    @Override
    public Department getDepartmentById(String id) {
        System.out.println("根据id获取oracle部门");
        return null;
    }
}
