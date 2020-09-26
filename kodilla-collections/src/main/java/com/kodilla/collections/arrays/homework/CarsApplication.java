package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Ford;
import java.util.Random;


public class CarsApplication {
    public static void main(String[] args) {

        Car[] cars = new Car[15];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();

        for (Car car : cars) {
            CarUtils.describeCar(car);
            car.increaseSpeed();
        }}

        public static Car drawCar(){
            Random random = new Random();

            int drawCarKind = random.nextInt(3);

            if (drawCarKind == 0)
                return new Fiat();
            else if (drawCarKind == 1)
                return new Ford();
            else
                return new Toyota();

        }
    }


