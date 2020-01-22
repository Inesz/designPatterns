package com.patterns.design.behavioral.state.ex1;

public interface State {
    public String showState();
    void next(Live live);
    void prev(Live live);
}