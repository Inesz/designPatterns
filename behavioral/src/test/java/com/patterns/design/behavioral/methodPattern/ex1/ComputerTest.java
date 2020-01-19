package com.patterns.design.behavioral.methodPattern.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @Test
    void whenComputerPremium_givenPremiumComponents_thenComputerPremiumIsCreated(){
        //when
        Computer pc =  new PremiumComputerBuilder().buildComputer();
        //then
        System.out.println(pc);
        assertTrue(pc.toString().toLowerCase().contains("Premium".toLowerCase()));
    }

    @Test
    void whenComputerStandard_givenStandardComponents_thenComputerStandardIsCreated(){
        //when
        Computer pc =  new StandardComputerBuilder().buildComputer();
        //then
        System.out.println(pc);
        assertTrue(pc.toString().toLowerCase().contains("Standard".toLowerCase()));
    }
}