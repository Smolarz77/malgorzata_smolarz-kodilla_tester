package com.kodilla.bank.homework;

public class CashMachine {

    //Ma ona zawierać tablicę ze zrealizowanymi transakcjami (liczbowa wartość dodatnia,
    // jeśli użytkownik wpłacił pieniądze i ujemna, jeśli użytkownik wypłacił pieniądze).
    // Dodaj metody zwracające saldo bankomatu oraz liczbę wykonanych transakcji.

    private int[] values; // Deklaracja tablicy
    private int size;

    public CashMachine() {
        this.size = 0;
        this.values = new int[0]; // Tabela na poczatku przyjmuje wartosc 0
    }

    public void add(int value) { // Metoda dodaje nowe wartosci do tabeli i zwiekszajaca jej rozmiar



        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length); // Metoda arraycopy pozwala na skopiowanie tablicy zrodlowej do tablicy docelowej
        newTab[this.size - 1] = value; // W kolejnej linii przypisujemy nową wartość do ostatniego elementu w tablicy (konieczne było odjęcie cyfry jeden od rozmiaru tablicy, indeksy liczymy od zera)
        this.values = newTab; // przypisanie nowo utworzonej tablicy do tablicy przechowywanej w klasie
    }

    public int[] getValues() { // metoda zwracajaca dlugosc tabeli
        return values;
    } // Metoda zwraca wartosci wpisane do tabeli


    public double getCashAmount() { // metoda zwracajaca wartosc na jaka przeprowadzono transakcje
        double cashAmount =0;

        for(int i = 0; i < this.values.length; i++) {
            cashAmount += this.values[i];
        }
        return cashAmount;

    }
    public double getAvarage() { // srednia wartosc transakcji
        if (this.values.length == 0) {  // niedozwolone dzielenie przez 0
            return 0;
        }

        return getCashAmount()/this.values.length;


    }
}