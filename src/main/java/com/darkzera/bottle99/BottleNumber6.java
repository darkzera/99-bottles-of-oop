package com.darkzera.bottle99;

public class BottleNumber6 extends BottleNumber {
    public BottleNumber6(int n) {
        super(n);
    }

    @Override
    public String quantity(){
        return "1";
    }
    @Override
    public String pronun(){
        return "one";
    }
    @Override
    public String container(){
       return "six-pack";
    }
    @Override
    public String action() {
        return "Take " + pronun() + " down and pass it around, ";
    }
    @Override
    public BottleNumber successor() {
        return FactoryBottle.create(number - 1);
    }
}
