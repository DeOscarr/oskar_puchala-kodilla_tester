package com.kodilla.bank.homework;

public class BankApplication {
    public static void main(String[] args) {

        CashMachine bankomat = new CashMachine();
        CashMachine bankomat1 = new CashMachine();
        CashMachine bankomat2 = new CashMachine();
        Bank testBank = new Bank();

        addValueToCashMashine(bankomat, 500, -100, 10, 200);
        addValueToCashMashine(bankomat1, 201, -10, 10, -20);
        addValueToCashMashine(bankomat2, 550, 150, -100, -20);

        testBank.addCashMachine(bankomat);
        testBank.addCashMachine(bankomat1);
        testBank.addCashMachine(bankomat2);

        System.out.println(testBank.getBalanceOfAllCashMachines());
        System.out.println(testBank.getPayment(bankomat));
        System.out.println(testBank.getPaymentOfAllCashMachines());
        System.out.println(testBank.getPayoffOfAllCashMachines());

        System.out.println(testBank.getAvgPayment(bankomat1));
        System.out.println(testBank.getAvgPayoff(bankomat1));
        System.out.println(testBank.getPayoff(bankomat));
    }

    private static void addValueToCashMashine(CashMachine bankomat, int value, int value1, int value2, int value3) {
        bankomat.addTransaction(value);
        bankomat.addTransaction(value1);
        bankomat.addTransaction(value2);
        bankomat.addTransaction(value3);
    }
}