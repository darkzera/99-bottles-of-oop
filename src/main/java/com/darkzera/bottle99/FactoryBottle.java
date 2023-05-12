package com.darkzera.bottle99;

public class FactoryBottle {
    public static BottleNumber create(int number){
        switch (number){

            case 0: return new BottleNumber0(number);

            case 1: return new BottleNumber1(number);

            default: return new BottleNumber(number);
        }
    }
}
