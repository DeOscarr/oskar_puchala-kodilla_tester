package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse myWarehouse = new Warehouse();
        Order myOrder;

        myWarehouse.addOrder(new Order("1"));
        myWarehouse.addOrder(new Order("2"));
        myWarehouse.addOrder(new Order("3"));
        myWarehouse.addOrder(new Order("4"));
        myWarehouse.addOrder(new Order("5"));
        myWarehouse.addOrder(new Order("6"));
        myWarehouse.addOrder(new Order("7"));

        try {
            myOrder = myWarehouse.getOrder("10");
            System.out.println("Existing order number: " + myOrder);
        } catch (OrderDoesNotExistException e) {
            System.out.println("Order does not exist.");
        }
    }
}