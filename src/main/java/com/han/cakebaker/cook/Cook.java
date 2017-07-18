package com.han.cakebaker.cook;

import com.han.cakebaker.SOUTHelper;
import com.han.cakebaker.device.Mixer;
import com.han.cakebaker.device.oven.Oven;
import com.han.cakebaker.exception.CakePasteException;
import com.han.cakebaker.productfactory.ProductEnum;
import com.han.cakebaker.productfactory.ProductFactory;
import com.han.cakebaker.productfactory.ProductFactoryImpl;
import com.han.cakebaker.productfactory.product.*;

public class Cook {
    private String name;
    private ProductFactory factory;

    public Cook(String name) {
        this.name = name;
        this.factory = new ProductFactoryImpl();
    }

    public String getName() {
        return name;
    }

    /*
    1) Начинка (Filler) - измельчить яблоко и банан, смешать и добавить 1ст. ложку сахара.
    */
    public Filler makeFiller(Filler filler){
        SOUTHelper.write("making filler...");
        filler.setApple((Apple) factory.createProduct(ProductEnum.APPLE));
        filler.setBanana((Banana) factory.createProduct(ProductEnum.BANANA));
        whip(filler.getApple());
        whip(filler.getBanana());
        blend();
        filler.setSugar((Sugar) factory.createProduct(ProductEnum.SUGAR));
        add(filler.getSugar());
        SOUTHelper.write(filler.getName() + " is ready...\n");
        return filler;
    }

    public Paste makePaste(Paste paste) throws CakePasteException{
        SOUTHelper.write("making paste...");
        paste.setFlour((Flour) factory.createProduct(ProductEnum.FLOUR));
        paste.setEgg((Egg) factory.createProduct(ProductEnum.EGG));
        paste.setSugar((Sugar) factory.createProduct(ProductEnum.SUGAR));
        paste.setWater((Water) factory.createProduct(ProductEnum.WATER));
        add(paste.getFlour());
        add(paste.getWater());
        add(paste.getEgg());
        add(paste.getSugar());

        blend();
        whip(paste);

        SOUTHelper.write(paste.getName() + " is ready...\n");
        return paste;
    }

    public Paste makeCakePaste(Filler filler, Paste paste){
        SOUTHelper.write("Making final cake pasta with filler...");
        roll(paste);
        add(filler);
        paste.setFiller(filler);
        grease((Egg) factory.createProduct(ProductEnum.EGG));
        SOUTHelper.write("Cake paste is ready...\n");
        return paste;
    }

    /*
    Смешать, Добавить, Взбить. Раскатать, Смазать, Запечь
     */
    public void blend(){
        SOUTHelper.write("blended");

    }
    public void add(Product product){
        SOUTHelper.write(product.getName() + " added.");

    }
    public void whip(Product product){
        Mixer mixer = Mixer.getInstance();
        mixer.whip(product);
        SOUTHelper.write(product.getName() + " whiped by mixer.");
    }
    public void roll(Paste paste){
        SOUTHelper.write(paste.getName() + " rolled");

    }
    public void grease(Product product){
        SOUTHelper.write("Greased by " + product.getName());

    }
    public void bakeCake(Oven oven, Paste paste) throws CakePasteException {
        if(paste == null || paste.getFiller() == null){
            throw new CakePasteException();
        }
            oven.bakeProduct(paste);
    }

}
