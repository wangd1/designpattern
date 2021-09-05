package com.wang.designpattern.abstractfactory;

/**
 * 所有在用简单工厂的地方,都可以考虑用反射来去除switch或if判断,解除分支带来的耦合
 * @author wangd1
 * @date 2021/9/5
 */
public class DataAccess {

    // 可配置在配置文件中
    
    private static final String db = "oracle";
    private static final String dbTemp = "Oracle";
    private static final String pack = "com.wang.designpattern.abstractfactory."+db+"."+dbTemp;

    public static IUser createUser(){
        String path = pack+"User";
        IUser user = null;
        try {
             user = (IUser)Class.forName(path).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    public static IDepartment createDepartment(){
        String path = pack +"Department";
        IDepartment department = null;
        try {
            department = (IDepartment)Class.forName(path).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return department;
    }

}
