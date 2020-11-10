package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ShopTestSuite {

    Shop shop = new Shop ();
    Order order01 = new Order(123, LocalDate.of(2019,5,18), "gosia");
    Order order02 = new Order(135, LocalDate.of(2019, 5, 16), "agnieszka");
    Order order03 = new Order(140, LocalDate.of(2020, 6, 15), "ania");
    Order order04 = new Order(110, LocalDate.of(2019, 6, 13), "jola");
    Order order05 = new Order(1520, LocalDate.of(2019, 4, 2), "viola");

    @Test
    public void shouldAddOrdersToShop() {
        //Given

        //when
        int numberOfOrders = shop.getOrdersSize();

        //Then
        assertEquals(5, numberOfOrders);

    }


    @Test
    public  void shoulReturnEmptyListIfDatesOutOfRange(){
        // Given

        // When
        List<Order> emptyList = shop.getOrdersFromToDate(LocalDate.of(2014,5,19), LocalDate.of(2016, 4, 12));
        // Then
        assertEquals(Collections.emptyList(), emptyList);

    }

    @Test
    public void shouldGetOrdersInValueRange (){
        //Given

        //When
        List<Order> orders = shop.getOrdersInValueRange(40, 150);

        assertEquals(4, orders.size());

    }

    @Test
    public void shouldReturnEmptyListWhenNoOrdersInValueRange() {
        // Given


        //when
        List<Order> emptyList = shop.getOrdersInValueRange(40, 50);

        //Then
        assertEquals(Collections.emptyList(), emptyList);
    }

    @Test
    public void shouldGetOrdersTotalValue () {
        // Given

        // When
        shop.getOrdersTotalValue();

        // Then
        assertEquals(2028, shop.getOrdersTotalValue(), 0.01);
    }

    @Test
    public void shouldGetExistingOrder() {
        // Given

        // When
        Order result = shop.getOrder(0);

        // Then
        assertEquals("gosia", result.getUser());
        assertEquals(123, result.getOrderValue());

    }
    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(order01);
        shop.addOrder(order02);
        shop.addOrder(order03);
        shop.addOrder(order04);
        shop.addOrder(order05);
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

}