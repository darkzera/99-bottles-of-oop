package com.darkzera.bottle99;

public class BottleNumber0 extends BottleNumber {
    public BottleNumber0(int n) {
        super(n);
    }

    @Override
    public String quantity(){
        return "no more";
    }
    @Override
    public String pronun(){
        return "one";
    }
    @Override
    public String container(){
       return "bottles";
    }
    @Override
    public String action() {
        return "Go to the store and buy some more, ";
    }
    @Override
    public BottleNumber successor() {
        return FactoryBottle.create(99);
    }
}
