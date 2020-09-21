package com.kodilla.intro;

import java.util.Random;

public class RandomNumbers {
    public int Numbers ()
    {
        Random random = new Random();
        return random.nextInt(31);
    }

    public int min (int min, int min2)  //liczba min
    {
        if (min2 < min)
            min = min2;
        return min;
    }

    public int max (int max, int max2)  //liczba max
    {
        if(max2 > max)
            max = max2;
        return max;
    }

    public static void main (String[] args)
    {
        RandomNumbers random = new RandomNumbers();

        int min = 0;
        int max = 0;
        int sum = 0;

        while (sum <= 5000)
        {
            sum += random.Numbers();
            min = random.min(min, random.Numbers());
            max = random.max(max, random.Numbers());
        }

        System.out.println("Najmniejsza wartosc  "+ min + "   " +"Najwieksza wartosc  "+ max + "   " + "Suma przekracza 5000 ->" +sum);
    }
}




