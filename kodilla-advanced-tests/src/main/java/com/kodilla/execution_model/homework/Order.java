package com.kodilla.execution_model.homework;

//klasę Order, która będzie przechowywać dane zamówienia:
// wartość zamówienia, datę oraz login osoby dokonującej zamówienia


import java.time.LocalDate;
import java.util.Objects;

public class Order {
    public double orderValue;
    private LocalDate orderDate;
    private String user;

    public Order (double orderValue, LocalDate orderDate, String user){
        this.orderValue=orderValue;
        this.orderDate=orderDate;
        this.orderDate=orderDate;

    }

    public double getOrderValue() {
        return orderValue;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderValue=" + orderValue +
                ", orderDate=" + orderDate +
                ", userLogin='" + user + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Double.compare(order.getOrderValue(), getOrderValue()) == 0 &&
                Objects.equals(getOrderDate(), order.getOrderDate()) &&
                Objects.equals(getUser(), order.getUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrderValue(), getOrderDate(), getUser());
    }
}
