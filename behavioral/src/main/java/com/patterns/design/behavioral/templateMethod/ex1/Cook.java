package com.patterns.design.behavioral.templateMethod.ex1;

public class Cook extends Worker {
    protected void startBreak() {
        System.out.println("Go for a cigarette.");
    }

    @Override
    protected void beginWork() {
        System.out.println("Put on your apron.");
    }

    @Override
    protected void endWork() {
        System.out.println("Put your apron into the washing machine.");
    }
}
