package com.kodilla.intro.z2_7;

public class Calculator {

        public static Calculator calculator2;
        static double PI =3.1415927;
        double r;
        public Calculator(){
            counter++;
        }
        static int counter =0;
        public double add (double a, double b){
            return a +b;
        }
        public double sub (double a, double b){
            return a - b;
        }
        public double circleArea (double r){
            return PI * r * r;
        }
        public double circlePerimeter(double r){
            return 2 * PI * r;
        }
    }
