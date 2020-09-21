package com.kodilla.intro.z2_4;

import com.kodilla.intro.z2_4.Grades;

public class TestGrades {
    public static void main (String[] args){
        Grades grades = new Grades();
        grades.addValue(1);
        grades.addValue(10);
        grades.addValue(10);

        System.out.println("Ostatnio dodana ocenę  " + grades.returnLastGrade() + "  Srednia ocen   " + grades.returnAverageGrade());

}}
