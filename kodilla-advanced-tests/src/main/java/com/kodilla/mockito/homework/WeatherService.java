package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherService {
    //Serwis umożliwia wysyłanie powiadomień na dwa sposoby:
    //    do wszystkich osób – informacje np. o zmieniającym się regulaminie,
    //    do osób obserwujących daną lokalizację – powiadomienie np. o zagrożeniu gradem.
    //
    //Warunki, jakie muszą zostać spełnione:
    //    Osoba zainteresowana może zostać zapisana do danej lokalizacji i zacznie otrzymywać powiadomienia.
    //    Można wycofać subskrypcję z danej lokalizacji.
    //    Można wycofać subskrypcję ze wszystkich lokalizacji, co równa się kompletnemu wypisaniu klienta z powiadomień.
    //    Powiadomienie dla osób w danej lokalizacji powinno dotrzeć tylko do określonej grupy osób.
    //    Możliwość wysyłki powiadomienia do wszystkich.
    //    Możliwość skasowania danej lokalizacji.



    private Map<Location, Set<Client>> locationClient = new HashMap<>();

    public void addSubscriber(Location location, Client client) {
        if (locationClient.containsKey(location)) {
            locationClient.get(location).add(client);
        } else {
            Set<Client> newClient = new HashSet<>();
            newClient.add(client);
            locationClient.put(location, newClient);
        }
    }

    public void sendNotification(Notification notification) {
        for (Set<Client> clients : locationClient.values())
            clients.forEach(client -> client.receive(notification));
    }

    public void removeLocation(Location location) {
        locationClient.put(location, new HashSet<>());
    }

    public int sizeOfMap() {
        return locationClient.size();
    }


    public void removeSubscription(Location location) {

        locationClient.put(location, new HashSet<>());
    }


    public void removeSubscription(Client client) {
        for (Map.Entry<Location, Set<Client>> loca : locationClient.entrySet()) {
            if (loca.getValue().contains(client))
                loca.getValue().remove(client);
        }

    }
}




