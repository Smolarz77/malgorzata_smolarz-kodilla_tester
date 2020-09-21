package com.kodilla.abstracts.z3_2;

public class Person {
    //klasa Person zawiera  pola firstName, age i job
    //Metoda wyświetla obowiązki danej osoby w pracy

    private String firstName;    //tutaj znajduja sie 3 zmienne
    private Job job;
    private int age;

    public Person (String firstName, int age,Job job){   //konstruktor Person
        this.firstName=firstName;
        this.age = age;
        this.job=job;
    }
    public Job getJob(){   //getter wydobywajacy zawod
        return job;

    }
public void getResponsibilities (Job Job){  //getter wydobywajacy obowiazki
        System.out.println("Name: firstName "+"Resoponsibilities: " + job.getResponsibilities()+"  " + "Salary:  "+job.getSalary());
}

}



