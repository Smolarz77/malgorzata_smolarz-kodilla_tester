package pl.kodilla.intro;

import pl.kodilla.intro.Grades;

public class TestGrades {
    public static void main (String[] args){
        Grades grades = new Grades();
        grades.addValue(1);
        grades.addValue(10);
        grades.addValue(10);

        System.out.println("Ostatnio dodana ocenę  " + grades.returnLastGrade() + "  Srednia ocen   " + grades.returnAverageGrade());

}}
