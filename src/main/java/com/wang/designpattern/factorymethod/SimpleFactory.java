package com.wang.designpattern.factorymethod;

public class SimpleFactory {

    public static Product createProduct(String type){
        switch (type){
            case "2":
                return new Product2();
            case "3":
                return new Product3();
            default:
                return null;
        }
    }

}
