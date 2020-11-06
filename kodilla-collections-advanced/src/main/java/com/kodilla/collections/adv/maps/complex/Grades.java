package com.kodilla.collections.adv.maps.complex;

import java.util.ArrayList;
import java.util.List;

public class Grades {
    private List<Double> grades = new ArrayList<>();

    public Grades(double... grades){
        for(double grade: grades)
            this.grades.add(grade);
    }

    public double getAverage(){
        double sum=0.0;
        for(double grade: grades)    //deklaracja pętli for-each
            sum +=grade;    //skrócona forma od następującego zapisu: sum = sum + grade;
        return sum/grades.size();
    }
    @Override
    public String toString() {
        return "Grades: " + grades.toString();
    }


}
