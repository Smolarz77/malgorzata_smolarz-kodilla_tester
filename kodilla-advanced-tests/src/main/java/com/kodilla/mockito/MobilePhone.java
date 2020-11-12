package com.kodilla.mockito;

public interface MobilePhone {
//Zakładamy, że każdy telefon komórkowy "potrafi" powiedzieć, czy potrzebuje ładowania,
// zwraca ilość wolnego miejsca oraz wie, jak uruchomić określoną aplikację
    boolean needsCharging();
    double getFreeStorage();
    void launchApplication(String applicationName);
}