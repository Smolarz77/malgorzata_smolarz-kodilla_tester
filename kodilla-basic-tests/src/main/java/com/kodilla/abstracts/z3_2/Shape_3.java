package com.kodilla.abstracts.z3_2;

public class Shape_3 extends Shape {
    public Shape_3(int a, int b, int h) {

        super(a,b);
    }

    @Override
    public int surfaceMethod(Shape shape){       //obliczanie trojkata
        return shape.getA() + shape.getB()+shape.getA()/2;

    }

    @Override
    public int circuitMethod(Shape shape) {
        return shape.getA() + shape.getB()+shape.getA()+shape.getH();
    }}

