package com.kodilla.collections.arrays;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Triangle;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Circle;

import java.util.Random;


public class ShapeApplication {


    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];   //tablica przechowuje 5 elementow
        for (int n = 0; n < shapes.length;  n++)   //wywolanie metody drawShape
            shapes[n] = drawShape();
        for (Shape shape : shapes)
            ShapeUtils.displayShapeInfo(shape);   //dla każdego elementu w tablicy shapes (dla każdej figury) wyświetlamy informacje o wymiarach
    }
    private static Shape drawShape() {

        Random random = new Random();
        int drawnShapeKind = random.nextInt(3);

        double a = random.nextDouble() * 100 + 1;
        double b = random.nextDouble() * 100 + 1;
        double c = random.nextDouble() * 100 + 1;
        if (drawnShapeKind == 0)
            return new Circle(a);
        else if (drawnShapeKind == 1)
            return new Square(a);
        else
            return new Triangle(a, b, c);
    }}

