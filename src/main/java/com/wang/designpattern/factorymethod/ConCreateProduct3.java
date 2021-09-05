package com.wang.designpattern.factorymethod;

/**
 * 工厂方法具体实现
 */
public class ConCreateProduct3 extends Application{
    @Override
    Product createProduct() {
        return new Product3();
    }
}
