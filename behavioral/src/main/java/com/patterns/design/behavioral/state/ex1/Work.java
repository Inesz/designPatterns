package com.patterns.design.behavioral.state.ex1;

public class Work implements State {
    @Override
    public String showState() {
        return "Work";
    }

    @Override
    public void next(Live live) {
        live.state = new Sleep();
    }

    @Override
    public void prev(Live live) {
        live.state = new Eat();
    }
}
