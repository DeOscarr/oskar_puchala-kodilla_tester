package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();
    Order PC = new Order(2200, LocalDate.of(2022, 3, 2), "Prebuild");
    Order Mouse = new Order(300, LocalDate.of(2022, 3, 5), "Razer");
    Order Keyboard = new Order(600, LocalDate.of(2022, 4, 22), "Logitech");
    Order Monitor = new Order(4800, LocalDate.of(2022, 5, 11), "BenQ");

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(PC);
        shop.addOrder(Mouse);
        shop.addOrder(Keyboard);
        shop.addOrder(Monitor);
    }

    @Test
    public void shouldAddOrders() {
        int numberOfOrders = shop.getQuantity();
        assertEquals(4, numberOfOrders);
    }

    @Test
    public void shouldReturnOrderFromTwoDates() {
        List<Order> expected = new ArrayList<>();
        expected.add(PC);
        expected.add(Mouse);
        List<Order> result = shop.getOrdersFromDates(LocalDate.of(2022, 3, 1), LocalDate.of(2022, 3, 6));
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnExtremeOrders() {
        List<Order> result = shop.getExtremeOrders(2000, 5000);
        List<Order> expected = new ArrayList<>();
        expected.add(PC);
        expected.add(Monitor);
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnSumOfValuesOrders() {
        double result = shop.getValueOfOrders();
        assertEquals(7900, result);
    }

}
