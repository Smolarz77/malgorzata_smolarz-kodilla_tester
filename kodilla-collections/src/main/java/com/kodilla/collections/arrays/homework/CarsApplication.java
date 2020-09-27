package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Ford;
import java.util.Random;

//Klasa CarsApplication z metodą public static Car drawCar(), która będzie tworzyła losowy samochód z losowo zwiększoną prędkością.
//Metoda main, w której znajdzie się tablica o losowym rozmiarze od 1 do 15 samochodów. Do każdego elementu tablicy wpisz
// wylosowany przy pomocy metody drawCar samochód,
// a następnie przy pomocy pętli wyświetl informacje o wszystkich samochodach znajdujących się w tablicy.
public class CarsApplication {
    public static void main(String[] args) {

        Car[] cars = new Car[15];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();

        for (Car car : cars) {
            car.increaseSpeed();
            CarUtils.describeCar(car);
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


