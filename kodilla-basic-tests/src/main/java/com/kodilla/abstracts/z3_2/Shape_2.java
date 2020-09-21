package com.kodilla.inheritance.homework.z3_2;

public class Shape_2 extends Shape{
    public Shape_2(int a, int h) {
        super(a, h);
    }

    @Override
    public int surface(Shape shape) {
        return shape.getA() * shape.getB();
    }

    @Override
    public int circuit(Shape shape) {
        return 4*shape.getA();
    }
}


