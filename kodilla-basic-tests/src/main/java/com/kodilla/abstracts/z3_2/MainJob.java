package com.kodilla.abstracts.z3_2;

public class MainJob {
    public static void main(String[] args) {
        Job lawyer = new Lawyer();
        Journalist journalist = new Journalist();

        Person person1 = new Person("Monika",25, lawyer);
        Person person2 = new Person("Henryk", 45, journalist);

        person1.getResponsibilities(person1.getJob());
        person2.getResponsibilities(person2.getJob());
    }
}
