package com.patterns.design.structural.flyweight.ex2;

public class MainVehicleParam implements Vehicle{
    Color color;

    public MainVehicleParam(Color color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color.name();
    }
}
