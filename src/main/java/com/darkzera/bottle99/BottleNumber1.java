package com.darkzera.bottle99;

public class BottleNumber1 extends BottleNumber {
    public BottleNumber1(int n) {
        super(n);
    }

    @Override
    public String quantity(){
        return String.valueOf(this.number);
    }
    @Override
    public String pronun(){
        return "it";
    }
    @Override
    public String container(){
       return "bottle";
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
