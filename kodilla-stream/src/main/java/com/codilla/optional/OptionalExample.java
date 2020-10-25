package com.codilla.optional;

import com.codilla.stream.User;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User("user1",300,100,"Test");


        Optional<User>optionalUser= Optional.ofNullable(user);

optionalUser.ifPresent(u-> System.out.println(u.getUserName()));

    }
}
