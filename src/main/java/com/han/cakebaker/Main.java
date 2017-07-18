package com.han.cakebaker;

import com.han.cakebaker.cook.Cook;
import com.han.cakebaker.device.oven.ElectricOven;
import com.han.cakebaker.device.oven.Oven;
import com.han.cakebaker.exception.CakePasteException;
import com.han.cakebaker.productfactory.product.Filler;
import com.han.cakebaker.productfactory.product.Paste;

public class Main {
    public static void main(String[] args) {
        Cook cook = new Cook("Iskender");
        Oven oven = new ElectricOven();

        System.out.println(cook.getName() + " will bake cake!\n");

        try{
            cook.bakeCake(oven,
                    cook.makeCakePaste(cook.makeFiller(new Filler("Filler")),
                    cook.makePaste(new Paste("Pasta")))
            );

        }catch (CakePasteException e){
            SOUTHelper.write("Cake has no filler or other ingredients in paste");
        }
    }
}
