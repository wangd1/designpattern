package com.wang.designpattern.singleton.innerclasssingleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author wangd1
 */
public class InnerClassSingletonTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // System.out.println(InnerClassSingleton.getInstance()==InnerClassSingleton.getInstance());
        // new Thread(()->{
        //     System.out.println(InnerClassSingleton.getInstance());
        // }).start();
        // new Thread(()->{
        //     System.out.println(InnerClassSingleton.getInstance());
        // }).start();
        //
        // Constructor<InnerClassSingleton> declaredConstructor = InnerClassSingleton.class.getDeclaredConstructor();
        // declaredConstructor.setAccessible(true);
        // InnerClassSingleton innerClassSingleton = declaredConstructor.newInstance();
        // InnerClassSingleton instance = InnerClassSingleton.getInstance();
        // System.out.println(innerClassSingleton==instance);

        InnerClassSingleton instance = InnerClassSingleton.getInstance();
        // ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tests"));
        // oos.writeObject(instance);
        // oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("tests"));
        InnerClassSingleton innerClassSingleton = (InnerClassSingleton) ois.readObject();
        System.out.println(innerClassSingleton==instance);
    }
}
class InnerClassSingleton  implements Serializable{
    static final long serialVersionUID = 40L;
    private static class InnerClassHolder{
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }
    private InnerClassSingleton(){
        // 防止反射攻击
        if(InnerClassHolder.instance!=null){
            throw new RuntimeException("单例不允许多个实例");
        }
    }
    public static InnerClassSingleton getInstance(){
        return InnerClassHolder.instance;
    }

    Object readResolve() throws ObjectStreamException{
        return InnerClassHolder.instance;
    }
}
