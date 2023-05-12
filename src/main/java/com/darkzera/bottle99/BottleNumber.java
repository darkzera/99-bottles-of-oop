package com.darkzera.bottle99;

public class BottleNumber {

    public int number;

    public BottleNumber(int n){
        this.number = n;
    }

    public String container(){
        if (this.number == 1){
            return "bottle";
        } else {
            final String bottles = "bottles";
            return bottles;
        }
    }

    public String pronun(){
        return this.number == 1 ? "it" : "one";
    }

    public String quantity(){
        switch (this.number){
            case 0:
                return "no more";
            case -1:
                return "99";
            default:
                return String.valueOf(this.number);
        }
    }

    public BottleNumber successor() {
        switch (this.number) {
            case 0:
                return FactoryBottle.create(99);
            default:
                return FactoryBottle.create(number - 1);
        }
    }

    public String action(){
        switch (this.number){
            case 0:
                return "Go to the store and buy some more, ";
            default:
                return "Take " + pronun() + " down and pass it around, ";
        }
    }

    public String printAbout(){
       return this.quantity() + " " + this.container();
    }

}
