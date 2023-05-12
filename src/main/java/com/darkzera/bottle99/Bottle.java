package com.darkzera.bottle99;

public class Bottle {

    public String verses(int max, int min){
        String result = "";

        for (int i = max; i >= min; i--){

            result += verse(i);

        }


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
        return new BottleNumber(number).container(number);
    }

    public String pronun(int number){
        return new BottleNumber(number).pronun(number);
    }

    public String quantity(int number){
        return new BottleNumber(number).quantity(number);
    }

    public int successor(int number) {
        return new BottleNumber(number).successor(number);
    }

    public String action(int number){
        return new BottleNumber(number).action(number);
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


