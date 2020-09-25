package com.kodilla.collections.interfaces;

public class InterfacesDemo {
    public static void main(String[] args) {

        Square square = new Square(10.00);
        showShapeDetails(square);

        Circle circle = new Circle(7.0);
        showShapeDetails(circle);

        Triangle triangle = new Triangle(6.0, 4.0, 7.211);
        showShapeDetails(triangle);

    }


public static void showShapeDetails(Shape shape) {
    System.out.println(shape.getArea());
    System.out.println(shape.getPerimeter());
}


    }

