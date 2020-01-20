package com.patterns.design.behavioral.memento.ex2;

import org.junit.jupiter.api.Test;

class CaretakerTest {
    @Test
    public void shouldWork() {
        Caretaker c = new Caretaker();
        c.read();
        c.write("hi");
        c.read();
        c.write(" hello");
        c.read();
        c.save();
        c.write(" oooo");
        c.read();
        c.save();
        c.undo();
        c.read();
        c.undo();
        c.read();
    }
}