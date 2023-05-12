package com.darkzera.bottle99;



public class Bottle {

    public String verses(int max, int min){
        String result = "";

        for (int i = max; i >= min; i--)
            result += verse(i);

        return result;
    }

    public String verse(int number){

        final BottleNumber btt = FactoryBottle.create(number);

        return capitalize(btt.printAbout()) + " of beer on the wall, " +
                btt.printAbout() + " of beer.\n" +
                btt.action() +
                btt.successor().printAbout() + " of beer on the wall.\n";

    }

    public String song(){
        return verses(99, 0);
    }

    public BottleNumber bottleNumberFor(int number){
        switch (number){
            case 0: return new BottleNumber0(number);

            case 1: return new BottleNumber1(number);

            default: return new BottleNumber(number);
        }
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


