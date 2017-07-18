package com.han.cakebaker.productfactory;

public enum ProductEnum {
    APPLE("Apple"),
    BANANA("Banana"),
    EGG("Egg"),
    FLOUR("Flour"),
    SUGAR("Sugar"),
    WATER("Water");

    private String name;

    private ProductEnum(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
