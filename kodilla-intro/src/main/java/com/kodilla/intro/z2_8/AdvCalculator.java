package com.kodilla.intro.z2_8;

import com.kodilla.intro.z2_7.UserDialogs;

public class AdvCalculator {
    public double calculate() {
        String userSelected = UserDialogs.getUserSelection();
        int a = UserDialogs.getValue();
        int b = UserDialogs.getValue();
        switch (userSelected) {
            case "ADD":
                return a + b;
            case "SUB":
                return a - b;
            case "DIV":
                return a / b;
            case "MUL":
                return a * b;
            default:
            return 0;
        }}}

