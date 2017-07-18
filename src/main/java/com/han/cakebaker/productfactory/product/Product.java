package com.han.cakebaker.productfactory.product;

public abstract class Product {
    public Product(String name){
        this.name = name;
    }
    private String name;
    private int weight;

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
