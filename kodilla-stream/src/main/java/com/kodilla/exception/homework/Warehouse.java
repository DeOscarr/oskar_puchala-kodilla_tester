package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesNotExistException { //TODO
       return orders
                .stream()
                .filter(x -> x.getNumber().equals(number))
                .findAny().orElseThrow(()->new OrderDoesNotExistException());
                //.collect(Collectors.joining());//The joining() method of Collectors Class, in Java,
                                                // is used to join various elements of a character or string array
                                                //into a single string object
        //https://www.geeksforgeeks.org/java-8-streams-collectors-joining-method-with-examples/
    }
}