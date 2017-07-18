package com.han.cakebaker.productfactory.product;

public class Filler extends Product{
    /*
    1) Начинка (Filler) - измельчить яблоко и банан, смешать и добавить 1ст. ложку сахара.
     */
    private Apple apple;
    private Banana banana;
    private Sugar sugar;

    public Filler(String name) {
        super(name);
    }

    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    public Banana getBanana() {
        return banana;
    }

    public void setBanana(Banana banana) {
        this.banana = banana;
    }

    public Sugar getSugar() {
        return sugar;
    }

    public void setSugar(Sugar sugar) {
        this.sugar = sugar;
    }
}
