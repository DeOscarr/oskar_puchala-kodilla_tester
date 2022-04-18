package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CashMachineTestSuite {

    @Test
    public void shouldCountAmountOfDepositsAndWithdraws() {
        CashMachine cashMachine = new CashMachine(3);
        assertEquals(0, cashMachine.getOperationsCount());
        cashMachine.depositMoney(700.0);
        assertEquals(1, cashMachine.getOperationsCount());
        assertEquals(cashMachine.depositCount(), cashMachine.getOperationsCount());
        cashMachine.depositMoney(370.0);
        assertEquals(2, cashMachine.getOperationsCount());
        assertEquals(cashMachine.depositCount(), cashMachine.getOperationsCount());
        cashMachine.depositMoney(4500.0);
        assertEquals(3, cashMachine.getOperationsCount());
        assertEquals(cashMachine.depositCount(), cashMachine.getOperationsCount());
        cashMachine.depositMoney(250.0);
        assertEquals(3, cashMachine.getOperationsCount());
        assertEquals(cashMachine.depositCount(), cashMachine.getOperationsCount());
        assertEquals(0, cashMachine.withdrawCount());
    }

    @Test
    public void shouldCountWithdraws() {
        CashMachine cashMachine = new CashMachine(4);
        assertEquals(0, cashMachine.getOperationsCount());
        cashMachine.withdrawMoney(200.0);
        assertEquals(1, cashMachine.getOperationsCount());
        assertEquals(cashMachine.withdrawCount(), cashMachine.getOperationsCount());
        cashMachine.withdrawMoney(900.0);
        assertEquals(2, cashMachine.getOperationsCount());
        assertEquals(cashMachine.withdrawCount(), cashMachine.getOperationsCount());
        cashMachine.withdrawMoney(1200.0);
        assertEquals(3, cashMachine.getOperationsCount());
        assertEquals(cashMachine.withdrawCount(), cashMachine.getOperationsCount());
        cashMachine.withdrawMoney(5000.0);
        assertEquals(4, cashMachine.getOperationsCount());
        assertEquals(cashMachine.withdrawCount(), cashMachine.getOperationsCount());
    }

    private static CashMachine CashMachineForSumTest() {
        CashMachine cashMachine = new CashMachine(10);
        cashMachine.depositMoney(300.0);
        cashMachine.withdrawMoney(500.0);
        cashMachine.depositMoney(400.0);
        cashMachine.withdrawMoney(300.0);
        cashMachine.depositMoney(500.0);
        cashMachine.withdrawMoney(1200.0);
        cashMachine.depositMoney(2000.0);
        return cashMachine;
    }

    @Test
    public void shouldSumWithdrawals() {
        CashMachine cashMachine = CashMachineForSumTest();
        assertEquals(3, cashMachine.withdrawCount());
        assertEquals(2000.0, cashMachine.withdrawSum(), 0.001);
    }

    @Test
    public void shouldSumDeposit() {
        CashMachine cashMachine = CashMachineForSumTest();
        assertEquals(4, cashMachine.depositCount());
        assertEquals(3200.0, cashMachine.depositSum(), 0.001);
    }

    @Test
    public void shouldBalanceDepositsAndWithdraw() {
        CashMachine cashMachine = new CashMachine(5);
        cashMachine.depositMoney(10000.0);
        cashMachine.withdrawMoney(3000.0);
        cashMachine.depositMoney(1000.0);
        cashMachine.withdrawMoney(4000.0);
        cashMachine.depositMoney(2000.0);
        assertEquals(3, cashMachine.depositCount());
        assertEquals(2, cashMachine.withdrawCount());
        assertEquals(6000.0, cashMachine.balance(), 0.001);
    }
}