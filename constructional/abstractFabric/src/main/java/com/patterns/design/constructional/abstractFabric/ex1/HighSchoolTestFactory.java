package com.patterns.design.constructional.abstractFabric.ex1;

public class HighSchoolTestFactory extends MathTestFactory {
    @Override
    public IShape CreateShape()
    {
        return new Triangle();
    }

    @Override
    public INumber CreateNumber()
    {
        return new ComplexNumber();
    }
}
