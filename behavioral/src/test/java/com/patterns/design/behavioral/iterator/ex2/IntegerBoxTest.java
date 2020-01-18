package com.patterns.design.behavioral.iterator.ex2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerBoxTest {

    @Test
    void whenIntegerBox_givenIntegerBoxHasValues_thenIteratorIterate(){
        //given
        IntegerBox iBox = new IntegerBox();
        Integer inputSize = 0;
        Integer outputSize = 0;

        for(Integer i = 1; i<30; i<<=1){
            iBox.add(i);
            inputSize++;
            System.out.println(i);
        }

        //when
        IntegerBox.Iterator firstItr = iBox.getIterator();
        for (firstItr.first(); !firstItr.isDone(); firstItr.next()) {
            System.out.println(firstItr.currentValue());
            outputSize++;
        }

        //then
        assertTrue(inputSize==outputSize);
    }
}