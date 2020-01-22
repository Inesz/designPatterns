package com.patterns.design.behavioral.state.ex1;

public class Live {
    /**
     * important, init state
     */
    public State state = new Eat();

    public String showState() {
        return state.showState();
    }

    public void next() {
        state.next(this);
    }

    public void prev() {
        state.prev(this);
    }
}
