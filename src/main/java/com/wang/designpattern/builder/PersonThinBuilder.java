package com.wang.designpattern.builder;

/**
 * 具体建造者
 * @author wangd1
 * @date 2021/9/5
 */
public class PersonThinBuilder extends PersonBuilder{
    @Override
    void buildHead() {
        System.out.println("建造thin head");
    }

    @Override
    void buildBody() {
        System.out.println("建造thin body");
    }

    @Override
    void buildLeftArm() {
        System.out.println("建造thin left arm");
    }

    @Override
    void buildRightArm() {
        System.out.println("建造thin right arm");
    }

    @Override
    void buildLeftLeg() {
        System.out.println("建造thin left leg");
    }

    @Override
    void buildRightLeg() {
        System.out.println("建造thin right leg");
    }
}
