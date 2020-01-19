package com.patterns.design.behavioral.memento.ex1;

public class TextEditorCaretaker {
    private TextWindowOriginator textWindow;
    private TextWindowStateMemento memento;

    public TextEditorCaretaker(TextWindowOriginator textWindow) {
        this.textWindow = textWindow;
    }

    public void write(String text) {
        textWindow.addText(text);
    }

    public String print() {
        return textWindow.getText();
    }

    //caretaker
    public void save() {
        memento = textWindow.save();
    }

    public void undo() {
        textWindow.restore(memento);
    }
}