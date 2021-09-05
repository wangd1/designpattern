package com.wang.designpattern.singleton.hungrysingleton;

/**
 * @author wangd1
 */
public class HungrySingletonTest {

    public static void main(String[] args) {
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton instance1 = HungrySingleton.getInstance();
        System.out.println(instance1==instance);
    }

}

class HungrySingleton{
    private static final HungrySingleton instance = new HungrySingleton();
    public HungrySingleton(){}
    public static HungrySingleton getInstance(){
        return instance;
    }
}
