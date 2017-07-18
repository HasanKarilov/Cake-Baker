package com.han.cakebaker.device.oven;

import com.han.cakebaker.SOUTHelper;
import com.han.cakebaker.productfactory.product.Product;

public class ElectricOven implements Oven {
    public void bakeProduct(Product product) {
        SOUTHelper.write("Cake baked in Electric Oven.");
    }
}
