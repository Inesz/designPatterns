package com.patterns.design.constructional.abstractFabric.ex1;
// klasa klienta (kontekst wykonania fabryki)
public class MathTest {
    private MathTestFactory mathTestFactory;

    public MathTest(MathTestFactory mathTestFactory)
    {
        this.mathTestFactory = mathTestFactory;
    }

    public void GenerateTest()
    {
        Object shape = this.mathTestFactory.CreateShape();
        Object number = this.mathTestFactory.CreateNumber();
        System.out.println("Test wygenerowany");
    }
}
