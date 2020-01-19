package com.patterns.design.behavioral.methodPattern.ex1;

public class PremiumComputerBuilder extends ComputerBuilder {
    @Override
    public String addMotherboard() {
        return "Premium motherboard";
    }

    @Override
    public String setupMotherboard() {
        return "premium setup";
    }

    @Override
    public String addProcessor() {
        return "Premium processor";
    }
}
