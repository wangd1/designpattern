package com.wang.designpattern.builder;

/**
 * Person创建者，build 头，身体，双手，双脚
 * @author wangd1
 * @date 2021/9/5
 */
public abstract class PersonBuilder {

    abstract void buildHead();
    abstract void buildBody();
    abstract void buildLeftArm();
    abstract void buildRightArm();
    abstract void buildLeftLeg();
    abstract void buildRightLeg();
}
