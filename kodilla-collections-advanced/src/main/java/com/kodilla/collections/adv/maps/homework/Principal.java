package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String firstname;
    private String lastname;

    public Principal(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Principal)) return false;
        Principal principal = (Principal) o;
        return Objects.equals(getFirstname(), principal.getFirstname()) &&
                Objects.equals(getLastname(), principal.getLastname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstname(), getLastname());
    }
}