package com.kodilla.spring.basic.dependency_injection.homework;

public class EMailNotificationService implements NotificationService {


    @Override
    public void success(String address) {
        System.out.println("Email: Package delivered to: " + address);
    }

    @Override
    public void fail(String address) {
        System.out.println("Email: Package not delivered to: " + address);
    }
}