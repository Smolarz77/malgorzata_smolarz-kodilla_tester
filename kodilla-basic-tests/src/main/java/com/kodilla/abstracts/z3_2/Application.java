package com.kodilla.abstracts.z3_2;

public class Application {
    public static void main(String[] args) {


        Shape_1 shape_1 = new Shape_1(8, 9);
        System.out.println("\nSquare: Surface: " + shape_1.surfaceMethod(shape_1) + "  Circuit: " + shape_1.circuitMethod(shape_1));

        Shape_2 shape_2 = new Shape_2(2, 9);
        System.out.println("\nRectangle: Surface: " + shape_2.surfaceMethod(shape_2) + "  Circuit: " + shape_2.circuitMethod(shape_2));

        Shape shape_3 = new Shape_3(7,5, 8);
        System.out.println("\nTriangle: Surface: " + shape_3.surfaceMethod(shape_3) + "  Circuit: " + shape_3.circuitMethod(shape_3));

    }
}

