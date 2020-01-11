package com.patterns.design.structural.flyweight.ex1;

public class SpecificVehicle implements Vehicle {
    private Engine engine;
    private Color color;

    public SpecificVehicle(Engine engine, Color color) {
        this.engine = engine;
        this.color = color;
    }


    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public String getColor() {
        return color.name();
    }

    public Engine getEngine() {
        return engine;
    }
}
