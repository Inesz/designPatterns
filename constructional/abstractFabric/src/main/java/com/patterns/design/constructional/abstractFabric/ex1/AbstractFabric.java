package com.patterns.design.constructional.abstractFabric.ex1;


public class AbstractFabric {
    public static void main(String[] args)
    {
        MathTest mathTest;

        mathTest = new MathTest(new PrimarySchoolTestFactory());
        mathTest.GenerateTest(); // łatwy test przy użyciu PrimarySchoolTestFactory()

        mathTest = new MathTest(new HighSchoolTestFactory());
        mathTest.GenerateTest(); // trudny test przy użyciu PrimarySchoolTestFactory()
    }
}