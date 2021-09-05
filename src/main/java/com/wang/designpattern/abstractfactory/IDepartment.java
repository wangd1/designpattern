package com.wang.designpattern.abstractfactory;

import com.wang.designpattern.abstractfactory.model.Department;

public interface IDepartment {
    void addDepartment();
    Department getDepartmentById(String id);
}
