package com.patterns.design.behavioral.memento.ex2;

public class StringOriginator implements Originator {
    private String state = "";

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public Memento save() {
        return new StringMemento(this, state);
    }

    public String read() {
        return state;
    }

    public void write(String state) {
            this.state += state;
    }
}