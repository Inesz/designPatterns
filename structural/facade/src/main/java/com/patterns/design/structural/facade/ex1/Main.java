package com.patterns.design.structural.facade.ex1;

public class Main {
    public static void main(String[] args){
        Facade facade = new Facade();
        System.out.println(facade.getABorBA());
        System.out.println(facade.getABorBA("A"));
        System.out.println(facade.getABorBA("B"));
        System.out.println(facade.getABorBA("c"));
    }
}

/**
 * facade hide implemetation.
 * This fake example takes some data from other component
 * make some comparison and return some message.
 *
 * output:
 * Mono A Mono B
 * Mono A Mono B
 * Mono B Mono A
 * Data not found
 */
