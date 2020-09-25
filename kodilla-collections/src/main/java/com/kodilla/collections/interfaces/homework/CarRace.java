package com.kodilla.collections.interfaces.homework;


    public class CarRace {
        public static void main(String[] args) {
            CarRace carRace = new CarRace();

            Fiat fiat = new Fiat(60);
            doRace(fiat);

            Ford ford = new Ford(90);
            doRace(ford);

            Toyota toyota = new Toyota(100);
            doRace(toyota);
            System.out.println("Speed Fiat: " + fiat.getSpeed() + "\nSpeed Ford: " + ford.getSpeed() + "\nSpeed Toyota: " + toyota.getSpeed());


        }


            private static void doRace (Car car){
                car.increaseSpeed();
                car.increaseSpeed();
                car.increaseSpeed();

                car.decreaseSpeed();
                car.decreaseSpeed();
            }

        }
