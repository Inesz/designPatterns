package com.patterns.design.behavioral.memento.ex2;

public class StringMemento implements Memento {
    private String state;
    private StringOriginator stringOriginator;

    public StringMemento(StringOriginator stringOriginator, String state) {
        this.stringOriginator = stringOriginator;
        this.state = state;
    }

    @Override
    public void restore() {
        stringOriginator.setState(state);
    }
}
