package com.patterns.design.behavioral.methodPattern.ex1;

public class StandardComputerBuilder extends ComputerBuilder {
    @Override
    public String addMotherboard() {
        return "Standard motherboard";
    }

    @Override
    public String setupMotherboard() {
        return "Standard setup";
    }

    @Override
    public String addProcessor() {
        return "Standard processor";
    }
}
