package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Configuration
public class CarConfiguration {


    @Bean
    public Car randomCar() {
        Season season =getRandomSeason();
        Map<Season,Car> seasonCarMap = new HashMap<>();
        seasonCarMap.put(Season.SPRING,new Sedan()); //wiosną sedanem
        seasonCarMap.put(Season.SUMMER,new Cabrio()); //Jeśli jest lato, chcemy jeździć kabrioletem,
        seasonCarMap.put(Season.AUTUMN,new Sedan());// jesienią sedanem
        seasonCarMap.put(Season.WINTER,new SUV()); //zimą SUV-em

        return seasonCarMap.get(season);
    }

    private enum Season {
        SPRING,
        SUMMER,
        AUTUMN,
        WINTER;
    }

    private Season getRandomSeason() {
        Random generator = new Random();
        int seasonsNumber = generator.nextInt(3);
        return Season.values()[seasonsNumber];
    }
}