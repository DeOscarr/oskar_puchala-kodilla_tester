package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {

    List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) { //dodanie zamowienia
        this.orders.add(order);
    }

    public List<Order>  getOrdersFromDates(LocalDate date1, LocalDate date2) { //zwrocenie listy zamowien z dwoch dat
        List<Order> ordersD = new ArrayList<>();
        for (Order order : orders) {
            if(date2.isAfter(order.getDate()) &&
                    date1.isBefore(order.getDate()))
                ordersD.add(order);
        }
        return ordersD;
    }

    public List<Order> getExtremeOrders(double value1, double value2) { //pobranie zamowien na podstawie przekazanego zakresu
        List<Order> ordersV = new ArrayList<>();
        for (Order order : orders) {
            if (value1 <= order.getValue() && value2 >= order.getValue())
                ordersV.add(order);
            //if (order.getValue()>=value1 && order.getValue()<=value2)
            //ordersV.add.(order)
        }
        return ordersV;
    }


    public int getQuantity() { //liczba zamowien
        return this.orders.size();
    }

    public double getValueOfOrders() { //wartosc wszystkich zamowien
        double sum = 0;
        for (Order order: orders){
            sum+= order.getValue();
        }
        return sum;
    }

    public int getSize() {
        return this.orders.size();
    }
}