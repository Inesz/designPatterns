package com.patterns.design.behavioral.strategy.ex1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

class StrategyContextsTest {

    @Test
    public void whenHowManyCharsIHave_givenStringArrayList_thenNumberOfChars() {
        //given
        ArrayList<String> digitsAsString = new ArrayList();
        digitsAsString.add("1");
        digitsAsString.add("5");
        digitsAsString.add("0");

        StrategyContexts strategyContexts = new StrategyContexts();
        int numberOfChars = 0;

        //when
        numberOfChars = strategyContexts.howManyCharsIHave(digitsAsString);

        //then
        System.out.println(numberOfChars);
        assertTrue(numberOfChars == 3);
    }

    @Test
    public void whenHowAmountIHaveInStrings_givenStringArrayList_thenAmountOfStrings() {
        //given
        ArrayList<String> digitsAsString = new ArrayList();
        digitsAsString.add("1");
        digitsAsString.add("5");
        digitsAsString.add("0");

        StrategyContexts strategyContexts = new StrategyContexts();
        int amountOfStrings = 0;

        //when
        amountOfStrings = strategyContexts.howAmountIHaveInStrings(digitsAsString);

        //then
        System.out.println(amountOfStrings);
        assertTrue(amountOfStrings == 6);
    }

    @Test
    public void whenHowAmountIHaveInIntegers_givenIntegerArrayList_thenAmountOfIntegers() {
        //given
        ArrayList<Integer> digits = new ArrayList();
        digits.add(1);
        digits.add(5);
        digits.add(0);
        //digits.add(null); java.lang.NullPointerException

        StrategyContexts strategyContexts = new StrategyContexts();
        int amountOfIntegers = 0;

        //when
        amountOfIntegers = strategyContexts.howAmountIHaveInIntegers(digits);

        //then
        System.out.println(amountOfIntegers);
        assertTrue(amountOfIntegers == 6);
    }
}