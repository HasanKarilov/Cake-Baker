package com.han.cakebaker.device;

import com.han.cakebaker.productfactory.product.Product;

public class Mixer {
    private Mixer(){

    }
    private static Mixer mixer;

    public static Mixer getInstance(){
        if(mixer==null){
            return new Mixer();
        }
        return mixer;
    }
    public void whip(Product product){

    }
}
