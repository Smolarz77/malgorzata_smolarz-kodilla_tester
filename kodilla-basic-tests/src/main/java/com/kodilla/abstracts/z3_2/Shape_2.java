package com.kodilla.abstracts.z3_2;

public class Shape_2 extends Shape{
    public Shape_2(int a, int h) {
        super(a, h);
    }

    @Override
    public int surfaceMethod(Shape shape) {
        return shape.getA() * shape.getB();
    }  //obliczanie kwadratu

    @Override
    public int circuitMethod(Shape shape) {
        return 4*shape.getA();
    }
}


