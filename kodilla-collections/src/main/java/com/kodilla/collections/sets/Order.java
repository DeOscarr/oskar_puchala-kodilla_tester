package com.kodilla.collections.sets;

import java.util.Objects;

public class Order {
    private String orderNumber;
    private String productName;
    private double quantity;

    public Order(String orderNumber, String productName, double quantity) {
        this.orderNumber = orderNumber;
        this.productName = productName;
        this.quantity = quantity;
    }
    public String getOrderNumber(){
        return orderNumber;
    }
    public String getProductName(){
        return productName;
    }
    public double getQuantity(){
        return quantity;
    }

    @Override public boolean equals(Object o) { ////////////////////////////////////////////////////
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass()) //getClass pobiera nazwe klasy wraz z nazwa pakietu/ zwroci false jesli porownujemy rozne od siebie klasy/ !=o.getClass oznacza ze jest rozne
            return false;
        Order order = (Order) o;
        return Double.compare(order.quantity, quantity) == 0
                && (order.orderNumber.equals(orderNumber))
                && this.productName.equals(order.productName);}

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber, productName, quantity);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber='" + orderNumber + '\'' + //'\'' escape character 
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
