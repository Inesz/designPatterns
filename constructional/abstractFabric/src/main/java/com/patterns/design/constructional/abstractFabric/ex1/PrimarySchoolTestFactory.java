package com.patterns.design.constructional.abstractFabric.ex1;

public class PrimarySchoolTestFactory extends MathTestFactory {
    @Override
    public IShape CreateShape()
    {
        return new Square();
    }


    @Override
    public INumber CreateNumber()
    {
        return new RealNumber();
    }
}
