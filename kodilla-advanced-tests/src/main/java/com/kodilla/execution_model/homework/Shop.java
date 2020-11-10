package com.kodilla.execution_model.homework;
// klasę Shop, która będzie przechowywać kolekcję unikalnych zamówień.
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

// klasę Shop, która będzie przechowywać kolekcję unikalnych zamówień.
    List<Order> orders=new ArrayList<>();

//    dodanie nowego zamówienia
    public void addOrder(Order order){
        this.orders.add(order);
    }
    //    zwrócenie listy zamówień z zakresu dwóch dat,
    public List<Order> getOrdersFromToDate (LocalDate from, LocalDate to) {
        return orders.stream()
                .filter(d -> d.getOrderDate().isAfter(from) && d.getOrderDate().isBefore(to))
                .collect(Collectors.toList());
    }
    //    pobranie zamówień na podstawie przekazanego zakresu (najmniejsza i największa wartość zamówienia),

    public List<Order> getOrdersInValueRange (double lowLimit, double hightLimit) {
        return orders.stream()
                .filter(v -> v.getOrderValue() >= lowLimit && v.getOrderValue() <= hightLimit)
                .collect(Collectors.toList());
    }
    //    zwrócenie liczby zamówień
    public int getOrdersSize(){
      return orders.size();

    }
    //    zsumowanie wartości wszystkich zamówień.
    public double getOrdersTotalValue () {
        return orders.stream()
                .map(t -> t.getOrderValue())
                .mapToDouble(t -> t)
                .sum();
    }

    public Order getOrder(int index) {
        if(index >= 0 && index < orders.size()) {
            return this.orders.get(index);
        }
        return null;
    }
}

