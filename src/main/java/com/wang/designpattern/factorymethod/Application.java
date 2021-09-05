package com.wang.designpattern.factorymethod;

public abstract class Application {

    abstract Product createProduct();

    public Product getProduct(){
        return createProduct();
    }
}
