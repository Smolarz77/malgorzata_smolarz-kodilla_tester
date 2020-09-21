package com.kodilla.inheritance.homework.z3_2;

public class Application {
    public static void main(String[] args) {

        Shape shape_3 = new Shape_3(4);
        System.out.println("Surface equals: " + shape_3.surface(shape_3) + "\nCircuit equals: " + shape_3.circuit(shape_3));

        Shape_1 shape_1 = new Shape_1(5, 7);
        System.out.println("\nSurface equals: " + shape_1.surface(shape_1) + "\nCircuit equals: " + shape_1.circuit(shape_1));

        Shape_2 shape_2 = new Shape_2(7, 9);
        System.out.println("\nSurface equals: " + shape_2.surface(shape_3) + "\nCircuit equals: " + shape_2.circuit(shape_3));

    }
}

