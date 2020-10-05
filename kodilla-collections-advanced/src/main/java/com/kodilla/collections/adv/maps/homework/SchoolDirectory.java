package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolDirector = new HashMap<>();

        Principal jacek = new Principal("Jacek", "Kaczmarek");   //tworzenie obiektow
        Principal zofia = new Principal("Zofia", "Glowacka");
        Principal jochen = new Principal("Jochen", "Richter");

        School jacekSchool = new School("School of English", 10, 24, 15);
        School zofiaSchool = new School("School of IT", 13, 17, 13, 15);
        School jochenSchool = new School("School of Hebrew", 18, 19, 21);

        schoolDirector.put(jacek, jacekSchool);  //utworzone obiekty umieszczam w mapie schoolDirektor
        schoolDirector.put(zofia, zofiaSchool);
        schoolDirector.put(jochen, jochenSchool);

        //Wykorzystując pętlę for-each, wyświetl informacje o dyrektorach placówek, nazwie szkoły którą kierują, oraz o
        // łącznej liczbie uczniów w każdej szkole.

        System.out.println(schoolDirector.get(jochen));
        for(Map.Entry<Principal, School> principalEntry :schoolDirector.entrySet())
            System.out.println(principalEntry.getKey().getFirstname() + " is a principal of " +
                    principalEntry.getValue().getSchoolName() + " with " + principalEntry.getValue().getSum() + " students");

    }
}

