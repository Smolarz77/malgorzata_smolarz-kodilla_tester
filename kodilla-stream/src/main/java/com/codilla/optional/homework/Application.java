package com.codilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//Klasę Application z metodą main, a w niej utwórz listę obiektów klasy Student i wypełnij ją przykładowymi danymi.
// Niektórzy uczniowie niech mają przypisanego nauczyciela, a niektórzy nie (wówczas pole teacher = null).
public class Application {
    public static void main(String[] args) {  //metoda main

        List<Student> students= new ArrayList<>();  //lista obiektow klasy student

        students.add(new Student ("Anna Kwiatkowska",new Teacher("Joachim Knoll"))); //przypisany nauczyciel
        students.add(new Student("Marek Bolkowski", null));  //nauczyciel nie jest przypisany
        students.add(new Student ("Marcin Kwiatkowski",new Teacher("Jochen Reszkowski")));
        students.add(new Student("Tatiana Nowakowska", null));

        for (Student student : students) {    //petla for-each
            System.out.println("Student name: " + student.getName() + " Teacher name: " + Optional
                    .ofNullable(student.getTeacher())
                    .map(Teacher::getName)
                    .orElse("<undefined>"));
        }
    }
}
