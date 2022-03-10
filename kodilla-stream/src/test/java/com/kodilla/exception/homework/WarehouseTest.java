package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void testGetOrder() throws OrderDoesNotExistException {
        //given
        Warehouse testWarehouse = new Warehouse();
        testWarehouse.addOrder(new Order("8"));
        testWarehouse.addOrder(new Order("9"));
        testWarehouse.addOrder(new Order("10"));
        //when
        Order testOrder = testWarehouse.getOrder("10");
        //then
        assertEquals("10", testOrder.getNumber());
    }

    @Test
    public void testGetOrderException(){
        //given
        Warehouse testWarehouse = new Warehouse();
        //when
        //then
        assertThrows(OrderDoesNotExistException.class, () -> testWarehouse.getOrder("20"));
    }

}