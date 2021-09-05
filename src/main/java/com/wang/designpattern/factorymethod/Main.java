package com.wang.designpattern.factorymethod;

public class Main {

    public static void main(String[] args) {
        Application a2 = new ConCreateProduct2();
        Product product2 = a2.getProduct();
        product2.print();
        Application a3 = new ConCreateProduct3();
        Product product3 = a3.getProduct();
        product3.print();
    }
}
