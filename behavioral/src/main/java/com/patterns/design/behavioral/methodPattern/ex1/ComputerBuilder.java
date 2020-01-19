package com.patterns.design.behavioral.methodPattern.ex1;

public abstract class ComputerBuilder {
    // ...

    //final to not being overwritten
    public final Computer buildComputer() {
        return new Computer(addMotherboard(), setupMotherboard(), addProcessor());
    }

    public abstract String addMotherboard();

    public abstract String setupMotherboard();

    public abstract String addProcessor();

    // ...
}
