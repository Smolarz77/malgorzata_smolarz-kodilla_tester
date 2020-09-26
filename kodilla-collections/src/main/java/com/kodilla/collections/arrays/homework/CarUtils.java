package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Ford;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println(" -----------------");
        System.out.println("Car Name:  " + getCarName(car));
        System.out.println("Car speed:  " + car.getSpeed());

    }

private static String getCarName(Car car) {
    if (car instanceof Fiat)
        return "Fiat";
    else if (car instanceof Ford)
        return "Ford";
    else if (car instanceof Toyota)
        return "Toyota";
    else
        return "Unknown car name";
}
}
