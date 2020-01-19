package com.patterns.design.behavioral.memento.ex1;

public class TextWindowStateMemento {
    private String stateText;

    public TextWindowStateMemento(String stateText) {
        this.stateText = stateText;
    }

    public String getStateText() {
        return stateText;
    }
}