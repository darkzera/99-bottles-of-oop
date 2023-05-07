package com.darkzera.bottle99;

public class Bottle {

    public String verses(int max, int min){
        String result = "";

        for (int i = max; i >= min; i--)
            result += verse(i);


        System.out.printf(result);
        return result;
    }

    public String verse(int quantity){

        switch (quantity){

            case 1:
                return quantity + " bottle of beer on the wall, "
                        + quantity + " bottle of beer.\n" +
                        "Take it down and pass it around, no more bottles of beer on the wall.\n";

            case 0:
                return "No more bottles of beer on the wall, " +
                        "no more bottles of beer.\n" +
                        "Go to the store and buy some more, " +
                        "99 bottles of beer on the wall.\n";

            case 2:
                return "2 bottles of beer on the wall, " +
                        "2 bottles of beer.\n" +
                        "Take one down and pass it around, " +
                        "1 bottle of beer on the wall.\n";

            case 99:
                return "99 bottles of beer on the wall, " +
                        "99 bottles of beer.\n" +
                        "Take one down and pass it around, " +
                        "98 bottles of beer on the wall.\n";
            default:
                return quantity + " bottles of beer on the wall, " + quantity +" bottles of beer.\n" +
                        "Take one down and pass it around, " +
                        --quantity + " bottles of beer on the wall.\n";

        }
    }

    public String song(){
        return verses(99, 0);
    }



}
