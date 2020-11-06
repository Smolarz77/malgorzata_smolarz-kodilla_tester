package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    private String schoolName;
    private List<Integer> students = new ArrayList<>();

    public School(String schoolName, Integer... students) {
        this.schoolName = schoolName;
        for (Integer student : students) {
            this.students.add(student);
        }
    }
    public String getSchoolName() {
        return schoolName;
    }
    public Integer getSum() {
        Integer sum = 0;
        for(Integer student : students)  //Operator += użyty w tym wyrażeniu to forma skrócona od następującego zapisu: sum = sum +
            sum += student;
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", students=" + students +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(schoolName, school.schoolName) &&
                Objects.equals(students, school.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolName, students);
    }}

