package com.kodilla.spring.basic.dependency_injection.homework;


public class PocztaPolskaDeliveryService implements DeliveryService{
    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 26) {
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("Delivering in progress...");
        return true;
    }
}