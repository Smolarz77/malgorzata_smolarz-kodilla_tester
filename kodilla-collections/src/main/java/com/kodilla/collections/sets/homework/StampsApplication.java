package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    //Wewnątrz metody main stwórz kolekcję znaczków (typu HashSet).
    // Sprawdź, czy do kolekcji nie da się dodać kilka razy takiego samego znaczka

    public static void main(String[] args) {
        Set<Stamp>stamps = new HashSet<>();
        stamps.add(new Stamp("  A ", 23,15, Boolean.TRUE));
        stamps.add(new Stamp("  B  ",15,10, Boolean.TRUE));
        stamps.add(new Stamp("  C ", 22,14, Boolean.FALSE));
        stamps.add(new Stamp("  D ", 23,15, Boolean.TRUE));
        stamps.add(new Stamp("  A ", 23,15, Boolean.TRUE));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
