package com.kodilla.collections.adv.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        //Klasę BookApplication z metodą main.
        //W metodzie main utwórz 2-3 obiekty klasy Book, używając do tego celu BookManager.
        //Sprawdź, czy adresy utworzonych obiektów są takie same.
       new BookManager("A. J. Heschel","Man Is Not Alone");
        new BookManager("Gołda Tencer","Jidisze Mame");
        new BookManager("Donald Tusk","Szczerze");
        new BookManager("A. J. Heschel","Man Is Not Alone");

        System.out.println("A. J. Heschel" =="Gołda Tencer ");
        System.out.println("A. J. Heschel".equals("Gołda Tencer"));
        System.out.println("_______________");

        System.out.println("A. J. Heschel"=="A. J. Heschel");
        System.out.println("A. J. Heschel".equals("A. J. Heschel"));
        System.out.println("_______________");

     System.out.println("Gołda Tencer" == "Donald Tusk");
        System.out.println("Gołda Tencer".equals("Donald Tusk"));
        System.out.println("_______________");

        System.out.println("Donald Tusk"=="A. J. Heschel");
        System.out.println("Donald Tusk".equals("A. J. Heschel"));
        System.out.println("_______________");
}}