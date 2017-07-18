package com.han.cakebaker.productfactory;

import com.han.cakebaker.productfactory.product.Product;

public interface ProductFactory {
    Product createProduct(ProductEnum name);
}
