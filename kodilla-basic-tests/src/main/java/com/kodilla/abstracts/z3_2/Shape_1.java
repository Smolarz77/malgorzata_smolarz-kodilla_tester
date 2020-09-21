package com.kodilla.abstracts.z3_2;

public class Shape_1 extends Shape{
    public Shape_1(int a, int b){
        super(a,b);
    }

    @Override
    public int surfaceMethod(Shape shape) {     //obliczanie powierzchni, prostokat

        return shape.getA() * shape.getB();
    }

    @Override
    public int circuitMethod(Shape shape) {   //obliczanie obwodu,prostokat

        return 2*shape.getA() + 2*shape.getB();
    }
}