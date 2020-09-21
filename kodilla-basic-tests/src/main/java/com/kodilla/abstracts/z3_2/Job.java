package com.kodilla.abstracts.z3_2;

public abstract  class Job {   //klasa abstrakcyjna

    private int salary;
   private String responsibilities;

   public Job (int salary, String responsibilities){  //konstruktor Job
       this.salary=salary;
       this.responsibilities =responsibilities;
   }
   public String getResponsibilities(){  //getter wyświetli obowiązki

       return responsibilities;
   }
   public int getSalary(){   //getter wyswietli wyplate

       return salary;
   }

}
