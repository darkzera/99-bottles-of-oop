package com.darkzera.bottle99;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BottleTest{

    private final Bottle bottles = new Bottle();

    @Test
    public void firstVerse() throws Exception {
        String result = bottles.verse(99);
        assertThat(result, is(
                "99 bottles of beer on the wall, " +
                        "99 bottles of beer.\n" +
                        "Take one down and pass it around, " +
                        "98 bottles of beer on the wall.\n"));
    }

    @Test
    public void anotherVerse() throws Exception {
        String result = bottles.verse(3);
        assertThat(result, is(
                "3 bottles of beer on the wall, " +
                        "3 bottles of beer.\n" +
                        "Take one down and pass it around, " +
                        "2 bottles of beer on the wall.\n"));
    }

    @Test
    public void verse2() {
        String result = bottles.verse(2);
        assertThat(result, is(
                "2 bottles of beer on the wall, " +
                        "2 bottles of beer.\n" +
                        "Take one down and pass it around, " +
                        "1 bottle of beer on the wall.\n"));
    }

    @Test
    public void verse1() {
        String result = bottles.verse(1);
        assertThat(result, is(
                "1 bottle of beer on the wall, " +
                        "1 bottle of beer.\n" +
                        "Take it down and pass it around, " +
                        "no more bottles of beer on the wall.\n"));
    }

    @Test
    public void verse0() {
        String result = bottles.verse(0);
        assertThat(result, is(
                "No more bottles of beer on the wall, " +
                        "no more bottles of beer.\n" +
                        "Go to the store and buy some more, " +
                        "99 bottles of beer on the wall.\n"));
    }

    @Test
    public void vBook_aFewVerses_(){
        String expected = "2 bottles of beer on the wall, " +
                "2 bottles of beer.\n" +
                "Take one down and pass it around, " +
                "1 bottle of beer on the wall.\n" +
                "1 bottle of beer on the wall, " +
                "1 bottle of beer.\n" +
                "Take it down and pass it around, " +
                "no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, " +
                "no more bottles of beer.\n" +
                "Go to the store and buy some more, " +
                "99 bottles of beer on the wall.\n";

        System.out.println(expected);
        assertThat(bottles.verses(2, 0), is(expected));

    }

    @Test
    public void sixPack(){
        String exp = "7 bottles of beer on the wall, 7 bottles of beer.\n" +
                "Take one down and pass it around, 1 six-pack of beer on the wall.\n" +
                "1 six-pack of beer on the wall, 1 six-pack of beer.\n" +
                "Take one down and pass it around, 5 bottles of beer on the wall.\n";

        assertThat(bottles.verses(7,6), is(exp));
    }

    @Test
    public void isCapitalizedOnlyFirstLetter(){
        assertThat(bottles.capitalize("sim bio"), is("Sim bio"));
    }

}