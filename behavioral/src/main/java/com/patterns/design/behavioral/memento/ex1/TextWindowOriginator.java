package com.patterns.design.behavioral.memento.ex1;

public class TextWindowOriginator {
    private StringBuilder currentText;

    public TextWindowOriginator() {
        this.currentText = new StringBuilder();
    }

    public void addText(String text) {
        currentText.append(text);
    }

    public String getText() {
        return currentText.toString();
    }

    //originator
    public TextWindowStateMemento save() {
        return new TextWindowStateMemento(currentText.toString());
    }

    public void restore(TextWindowStateMemento save) {
        currentText = new StringBuilder(save.getStateText());
    }
}