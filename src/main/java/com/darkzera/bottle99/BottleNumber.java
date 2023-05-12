package com.darkzera.bottle99;

public class BottleNumber {

    public int data;

    public BottleNumber(int n){
        this.data = n;
    }

    public String container(int number){
        if (number == 1){
            return "bottle";
        } else {
            final String bottles = "bottles";
            return bottles;
        }
    }

    public String pronun(int number){
        return number == 1 ? "it" : "one";
    }

    public String quantity(int number){
        switch (number){
            case 0:
                return "no more";
            case -1:
                return "99";
            default:
                return String.valueOf(number);
        }
    }

    public int successor(int number) {
        switch (number) {
            case 0:
                return 99;
            default:
                return number - 1;
        }
    }

    public String action(int number){
        switch (number){
            case 0:
                return "Go to the store and buy some more, ";
            default:
                return "Take " + pronun(number) + " down and pass it around, ";
        }
    }

}
