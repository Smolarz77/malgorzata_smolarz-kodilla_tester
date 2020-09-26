package com.kodilla.collections.interfaces.homework;


    public class CarRace {
        public static void main(String[] args) {
            CarRace carRace = new CarRace();

            Fiat fiat = new Fiat();      //obiekty samochodów
           carRace.doRace(fiat);

            Ford ford = new Ford();
            carRace.doRace(ford);


            Toyota toyota = new Toyota();
          carRace.doRace(toyota);


        }

//Metoda doRace(Car car), która na przekazanym samochodzie wywoła trzykrotnie metodę
// increaseSpeed() oraz dwukrotnie metodę
// decreaseSpeed() i na końcu wyświetli wartość odczytaną metodą getSpeed()

        private static void doRace(Car car) {
            for(int i = 0; i < 4; i++) {
                car.increaseSpeed();
            }
            for (int i = 0; i < 3; i++){
                car.decreaseSpeed();
            }
            System.out.println(car.getClass().getSimpleName() +": " + car.getSpeed());
        }
    }