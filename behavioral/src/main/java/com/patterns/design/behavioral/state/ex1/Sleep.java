package com.patterns.design.behavioral.state.ex1;

public class Sleep implements State{
    @Override
    public String showState() {
        return "Sleep";
    }

    @Override
    public void next(Live live) {
        System.out.println("last state");
    }

    @Override
    public void prev(Live live) {
        live.state = new Work();
    }
}
