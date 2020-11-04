package com.kodilla.spring.basic.dependency_injection.homework;


public class WhatsUppNotificationService implements NotificationService {
    @Override
    public void success(String address) {
        System.out.println("Message: Package delivered to: " + address);
    }

    @Override
    public void fail(String address) {
        System.out.println("Message: Package not delivered to: " + address);
    }
}