package com.patterns.design.behavioral.com.patterns.design.behavioral.templateMethod.ex1;

public class Programmer extends Worker {
    protected void startBreak() {
        System.out.println("Make coffee.");
    }

    @Override
    protected void beginWork() {
        System.out.println("Turn on the computer.");
    }

    @Override
    protected void endWork() {
        System.out.println("Turn off the computer.");
    }
}
