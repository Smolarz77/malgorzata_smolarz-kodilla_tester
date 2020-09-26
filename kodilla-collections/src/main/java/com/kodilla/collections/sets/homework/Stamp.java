package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

    //Utwórz klasę Stamp reprezentującą znaczek pocztowy.
    // Klasa powinna mieć pola na nazwę oraz wymiary znaczka,
    // a także informację o tym, czy znaczek jest ostemplowany czy nie.

private String stampName;
private int sHeight;
private int sWidth;
private boolean stampStamped;

public Stamp(String stampName, int sHeight, int sWidth, boolean stampStamped){
    this.stampName=stampName;
    this.sHeight=sHeight;
    this.sWidth=sWidth;
    this.stampStamped=stampStamped;
}

    public String getStampName() {
        return stampName;
    }

    public int getsHeight() {
        return sHeight;
    }

    public int getsWidth() {
        return sWidth;
    }

    public boolean isStampStamped() {
        return stampStamped;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", sHeight=" + sHeight +
                ", sWidth=" + sWidth +
                ", stampStamped=" + stampStamped +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, sHeight, sWidth, stampStamped);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return sHeight == stamp.sHeight &&
                sWidth == stamp.sWidth &&
                stampStamped == stamp.stampStamped &&
                Objects.equals(stampName, stamp.stampName);
    }
}
