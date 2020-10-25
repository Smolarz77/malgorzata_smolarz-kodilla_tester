package com.codilla.stream;

import com.codilla.stream.UsersRepository;

import java.util.List;
import java.util.stream.Collectors;
public class UsersManager {
    public static void main(String[] args) {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getGroup().equals("Chemists"))
                .map(u -> u.getUserName())
                .collect(Collectors.toList());
        System.out.println(usernames);
    }

    public static String getUserName(User user)  {
        return user.getUserName();
    }
}
