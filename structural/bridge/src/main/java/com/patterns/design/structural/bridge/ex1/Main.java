package com.patterns.design.structural.bridge.ex1;

public class Main {

    public static void main(String[] args){
        Shape square = new Square(new Red());
        Shape squareBlue = new Square(new Blue());

        System.out.println(square.draw());
        System.out.println(squareBlue.draw());
    }
}

/*
For the Bridge pattern, we'll consider two layers of abstraction;
one is the geometric shape (like triangle and square)
which is filled with different colors (our second abstraction layer)

output:

Square drawn. Color is Red
Square drawn. Color is Blue
 */