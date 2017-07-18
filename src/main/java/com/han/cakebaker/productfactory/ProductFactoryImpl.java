package com.han.cakebaker.productfactory;

import com.han.cakebaker.productfactory.product.*;

public class ProductFactoryImpl implements ProductFactory {
    public Product createProduct(ProductEnum name) {
        switch (name){
            case APPLE: return new Apple(ProductEnum.APPLE.getName());
            case EGG: return new Egg(ProductEnum.EGG.getName());
            case FLOUR: return new Flour(ProductEnum.FLOUR.getName());
            case WATER: return new Water(ProductEnum.WATER.getName());
            case SUGAR: return new Sugar(ProductEnum.SUGAR.getName());
            case BANANA: return new Banana(ProductEnum.BANANA.getName());

            default: throw new IllegalArgumentException();
        }

    }
}
