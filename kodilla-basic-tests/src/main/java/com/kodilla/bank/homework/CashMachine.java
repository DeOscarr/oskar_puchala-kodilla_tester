package com.kodilla.bank.homework;

public class CashMachine {
    private double[] operations;
    private int operationsCount;

    public CashMachine(int size) {
        operations = new double[size];
        operationsCount = 0;
    }

    private void runOperation(double amount) {
        if (operationsCount < operations.length) {
            operations[operationsCount] = amount;
            operationsCount++;
        }
    }

    public void depositMoney(double amount) {
        runOperation(amount);
    }

    public void withdrawMoney(double amount) {
        runOperation(-amount);
    }

    public int depositCount() {
        int count = 0;
        for (int i = 0; i < operationsCount; i++) {
            if (operations[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public int withdrawCount() {
        int count = 0;
        for (int i = 0; i < operationsCount; i++) {
            if (operations[i] < 0) {
                count++;
            }
        }
        return count;
    }

    public double depositSum() {
        double sum = 0;
        for (int i = 0; i < operationsCount; i++) {
            if (operations[i] > 0) {
                sum += operations[i];
            }
        }
        return sum;
    }

    public double withdrawSum() {
        double sum = 0;
        for (int i = 0; i < operationsCount; i++) {
            if (operations[i] < 0) {
                sum += -operations[i];
            }
        }
        return sum;
    }

    public double balance() {
        return depositSum() - withdrawSum();
    }

    public int getOperationsCount() {
        return operationsCount;
    }
}