package com.patterns.design.structural.bridge.ex1;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public String draw();
}

