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
        final int successor = successor(number);

                return  capitalize(quantity(number)) + " " + container(number) + " of beer on the wall, " +
                        quantity(number) + " " + container(number) + " of beer.\n" +
                        action(number) +
                        quantity(successor) + " " + container(successor) +"" + " of beer on the wall.\n";
    }

    public String song(){
        return verses(99, 0);
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

    public String capitalize(String v){

        String buildable = "";
        char[] chars = v.toCharArray();

        if (!v.isEmpty()){
            for (int i = 0; i < chars.length; i++) {
                char fill = chars[i];
                if (i == 0)
                    fill = Character.toUpperCase(fill);
                buildable += fill;
            }
        }

        return buildable;
    }
}


