package com.kodilla.execution_model;

public class Item {
    private String name;
    private double price;
    //Wewnątrz tworzymy klasę Item, która będzie reprezentować pozycję na fakturze.
// Każdy obiekt nowego typu będzie zawierać nazwę i cenę.

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}