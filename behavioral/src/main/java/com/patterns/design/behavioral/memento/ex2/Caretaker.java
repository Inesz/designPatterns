package com.patterns.design.behavioral.memento.ex2;

import java.util.Stack;

public class Caretaker {
    private Stack<Memento> history = new Stack();
    private StringOriginator o = new StringOriginator();

    public void undo() {
        history.pop();
        if (!history.empty())
            history.peek().restore();
    }

    public void save() {
        Memento memento = o.save();
        history.push(memento);
    }

    public void read() {
        System.out.println(o.read());
    }

    public void write(String text) {
        o.write(text);
    }
}