package com.kodilla.intro.z2_6;

public class User {
    private String name;
    private double age;
    private double height;

    public User(String name, double age, double height) {   //Konstruktor
        this.name = name;    //słówko this wskazuje, że w ramach konstruktora
        this.age = age;       //chcemy odwołać się do atrybutów klasy
        this.height = height;
    }

    public String getName() { return name; }
    public void setName(String name) {

        this.name = name;
    }


    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
