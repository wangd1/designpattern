package com.wang.designpattern.singleton.lazysingleton;

/**
 * @author wangd1
 */
public class LazySingletonTest {

    public static void main(String[] args) {
        // LazySingleton instance = LazySingleton.getInstance();
        // LazySingleton instance1 = LazySingleton.getInstance();
        // System.out.println(instance==instance1);

        new Thread(()->{
            System.out.println(LazySingleton.getInstance());
        }).start();

        new Thread(()->{
            System.out.println(LazySingleton.getInstance());
        }).start();

    }
}
class LazySingleton{
    private static volatile LazySingleton instance;
    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(instance==null){
            synchronized (LazySingleton.class){
                if(instance==null){
                    instance = new LazySingleton();
                    // 字节码曾
                    // 1.分配空间
                    // 3引用赋值
                    // 2初始化
                }
            }
        }
        return instance;
    }
}
