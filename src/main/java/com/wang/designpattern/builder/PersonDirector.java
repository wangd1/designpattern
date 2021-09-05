package com.wang.designpattern.builder;

/**
 * person指挥者,
 * 用来控制建造过程，隔绝用户与建造过程的关联
 * @author wangd1
 * @date 2021/9/5
 */
public class PersonDirector {
    private PersonBuilder personBuilder;

    public PersonDirector(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }

    public void createPerson(){
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildLeftArm();
        personBuilder.buildRightArm();
        personBuilder.buildLeftLeg();
        personBuilder.buildRightLeg();
    }

}
