package com.kodilla.inheritance.homework.z3_2;

public class Shape_3 extends Shape {
    public Shape_3(int a) {
        super(a);
    }

    @Override
    public int surface(Shape shape) {
        return shape.getA() * shape.getA();
    }

    @Override
    public int circuit(Shape shape) {
        return 4*shape.getA();
    }}

