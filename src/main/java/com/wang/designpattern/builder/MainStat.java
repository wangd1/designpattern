package com.wang.designpattern.builder;

/**
 * @author wangd1
 * @date 2021/9/5
 */
public class MainStat {
    public static void main(String[] args) {
        PersonDirector personDirector = new PersonDirector(new PersonThinBuilder());
        personDirector.createPerson();
    }
}
