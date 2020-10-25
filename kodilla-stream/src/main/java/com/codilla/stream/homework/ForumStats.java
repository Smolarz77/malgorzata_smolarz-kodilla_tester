package com.codilla.stream.homework;

import com.codilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        //W metodzie main uruchom Stream na kolekcji użytkowników zwracanej przez UsersRepository.
        //Napisz Stream tak, aby obliczył średnią liczbę postów dla użytkowników, których wiek jest >= 40.
        double average1 = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(u -> u.getNumberOfPosts())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(average1);
//Napisz kolejny Stream, który obliczy średnią liczbę postów dla użytkowników, których wiek jest < 40.
        double average2 = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() < 40)
               .map(u-> u.getNumberOfPosts())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(average2);
    }

    }

