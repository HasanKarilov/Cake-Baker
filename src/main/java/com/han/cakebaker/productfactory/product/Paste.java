package com.han.cakebaker.productfactory.product;

public class Paste extends Product{
    /*
    2) Тесто (Paste) - 0,5 кг муки заправить 1 ст. воды, добавить 1 яйцо, 1 ст. ложку сахара. Смешать и взбить.
     */

    private Flour flour;
    private Water water;
    private Egg egg;
    private Sugar sugar;
    private Filler filler;

    public Paste(String name) {
        super(name);
        this.filler = null;
    }

    public Flour getFlour() {
        return flour;
    }

    public void setFlour(Flour flour) {
        this.flour = flour;
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public Egg getEgg() {
        return egg;
    }

    public void setEgg(Egg egg) {
        this.egg = egg;
    }

    public Sugar getSugar() {
        return sugar;
    }

    public void setSugar(Sugar sugar) {
        this.sugar = sugar;
    }

    public Filler getFiller() {
        return filler;
    }

    public void setFiller(Filler filler) {
        this.filler = filler;
    }
}
