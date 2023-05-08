package com.darkzera.bottle99;

public class Bottle {

    public String verses(int max, int min){
        String result = "";

        for (int i = max; i >= min; i--)
            result += verse(i);


        System.out.printf(result);
        return result;
    }

    public String verse(int number){
        switch (number){

            case 0:
                return "No more bottles of beer on the wall, " +
                        "no more bottles of beer.\n" +

                        "Go to the store and buy some more, " +
                        "99 bottles of beer on the wall.\n";

            case 1:
                return  number + " "+container(number) + " of beer on the wall, " +
                        number +" "+ container(number) +  " of beer.\n" +

                        "Take it down and pass it around, " +
                        "no more bottles of beer on the wall.\n";

            default:
                return  number + " " + container(number) + " of beer on the wall, " +
                        number + " " + container(number) + " of beer.\n" +

                        "Take one down and pass it around, " +
                        --number + " " + container(--number) + " of beer on the wall.\n";
        }
    }

    public String song(){
        return verses(99, 0);
    }

    public String container(int number){
        return number <= 1 ? "bottle" : "bottles";
    }




}
