package com.kodilla.collections.adv.maps;
import java.util.Map;
import java.util.HashMap;

public class BasicMapExample {
    public static void main(String[] args) {
        Map<String, Double>grades = new HashMap<>();
        grades.put("Mathematics", 5.0);
        grades.put("Physics", 4.5);
        grades.put("Philosophy",4.0);
        Double grade =grades.get("Mathematics");
        System.out.println(grade);
        for (Map.Entry<String, Double> note: grades.entrySet()){
            System.out.println("Grade of " + note.getKey()+ " is equal to " + note.getValue());
        }

    }
}
