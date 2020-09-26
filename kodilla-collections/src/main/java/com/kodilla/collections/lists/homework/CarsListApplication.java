package com.kodilla.collections.lists.homework;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.arrays.homework.CarUtils;

import java.util.ArrayList;
import java.util.List;

    public class CarsListApplication {
        public static void main(String[] args) {
            List<Car> cars = new ArrayList<>();   //Kolekcja samochodów  (typu ArrayList),
                                            // której typem elementów jest dowolna klasa
                                         //  implementująca interfejs Car.

            Ford ford = new Ford();
            cars.add(new Fiat());
            cars.add(new Toyota());
            cars.add(new Ford());

            cars.remove(1);     //usuniecie 1 samochodu metoda remove(int index)
            cars.remove(ford);       //usuniecie 1 samochodu metoda remove(Object o)

            System.out.println(cars.size());  //wyświetlona zawartość kolekcji, a także informacja o jej rozmiarze
            for (Car car : cars) {
                car.increaseSpeed();
                if (car.getSpeed() > 0)
                    CarUtils.describeCar(car);
            }
        }
    }

