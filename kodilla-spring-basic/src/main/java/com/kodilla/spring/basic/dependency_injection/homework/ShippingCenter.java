package com.kodilla.spring.basic.dependency_injection.homework;


//Zauważ, że ShippingCenter zawiera dwie zależności.
// Twoim celem jest wyeliminowanie ich. Postaraj się użyć interfejsów.

    public class ShippingCenter {


        private DeliveryService deliveryService;
        private NotificationService notificationService;

        public ShippingCenter(DeliveryService deliveryService, NotificationService notificationService) {
            this.deliveryService = deliveryService;
            this.notificationService = notificationService;
        }

        public void sendPackage(String address, double weight) {
            if (deliveryService.deliverPackage(address, weight)) {
                notificationService.success(address);
            } else {
                notificationService.fail(address);
            }
        }}