package com.darkzera.bottle99;



public class Bottle {

    public String verses(int max, int min){
        String result = "";

        for (int i = max; i >= min; i--)
            result += verse(i);

        return result;
    }

    public String verse(int number){

        final BottleNumber btt = new BottleNumber(number);

        final BottleNumber bttNext = new BottleNumber(btt.successor());

        return capitalize(btt.printAbout()) + " of beer on the wall, " +
                btt.printAbout() + " of beer.\n" +
                btt.action() +
                bttNext.printAbout() + " of beer on the wall.\n";

    }

    public String song(){
        return verses(99, 0);
    }

    public String container(int number) throws NoSuchMethodException {
        throw new NoSuchMethodException();
    }

    public String pronun(int number) throws NoSuchMethodException {
        throw new NoSuchMethodException();
    }

    public String quantity(int number) throws NoSuchMethodException {
        throw new NoSuchMethodException();
    }

    public int successor(int number) throws NoSuchMethodException {
        throw new NoSuchMethodException();
    }

    public String action(int number) throws NoSuchMethodException {
        throw new NoSuchMethodException();
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


