package com.kodilla.abstracts.z3_2;

public abstract class Shape {

    private int a;
    private int b;
    private int h;

    public Shape (int a, int b)
    {
        this.a = a;
        this.b = b;


    }

    public Shape (int a)
    {
        this.a = a;
    }

    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }
    public int getH(){
        return h;
    }

    public abstract int surfaceMethod(Shape shape);  //metoda: powierzchnia

    public abstract int circuitMethod(Shape shape);  //metoda: obwód

}