package com.patterns.design.behavioral.state.ex1;

public class Eat implements State {
    @Override
    public String showState() {
        return "Eat";
    }

    @Override
    public void next(Live live) {
        live.state = new Work();
    }

    @Override
    public void prev(Live live) {
        System.out.println("This is the first state.");
    }
}
