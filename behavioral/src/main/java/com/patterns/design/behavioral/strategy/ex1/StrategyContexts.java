package com.patterns.design.behavioral.strategy.ex1;

import java.util.ArrayList;
import java.util.Collection;

public class StrategyContexts {

    public int howManyCharsIHave(ArrayList<String> arrayList) {
        return new countChars().count(arrayList);
    }

    public int howAmountIHaveInStrings(ArrayList<String> arrayList) {
        return new sumStrings().count(arrayList);
    }

    public int howAmountIHaveInIntegers(ArrayList<Integer> arrayList) {
        return new sumIntigers().count(arrayList);
    }

    public class countChars extends StrategyAbstraction<String> {

        @Override
        public int count(Collection<String> collection) {
            int charsCount = 0;
            for (String c : collection) {
                charsCount += c.length();
            }
            return charsCount;
        }
    }

    public class sumStrings extends StrategyAbstraction<String> {

        @Override
        public int count(Collection<String> collection) {
            int charsCount = 0;
            for (String c : collection) {
                charsCount += Integer.parseInt(c);
            }
            return charsCount;
        }
    }

    public class sumIntigers extends StrategyAbstraction<Integer> {

        @Override
        public int count(Collection<Integer> collection) {
            int charsCount = 0;
            for (Integer c : collection) {
                charsCount += c;
            }
            return charsCount;
        }
    }
}