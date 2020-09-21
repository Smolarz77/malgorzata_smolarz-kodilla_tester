package com.kodilla.inheritance.homework.z3_2;

public class Shape_1 extends Shape{
    public Shape_1(int a, int b){
        super(a,b);
    }

    @Override
    public int surface(Shape shape) {
        return shape.getA() * shape.getB();
    }

    @Override
    public int circuit(Shape shape) {
        return 2*shape.getA() + 2*shape.getB();
    }
}