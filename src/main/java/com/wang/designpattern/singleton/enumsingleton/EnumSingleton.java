package com.wang.designpattern.singleton.enumsingleton;

/**
 * @author wangd1
 */
public enum EnumSingleton {
    /**
     * 实例
     */
    INSTANTE;
    public void print(){
        System.out.println(this.hashCode());
    }
}

class EnumSingletonTest{
    public static void main(String[] args) {
        EnumSingleton instante = EnumSingleton.INSTANTE;
        EnumSingleton instante1 = EnumSingleton.INSTANTE;
        System.out.println(instante==instante1);
    }
}

