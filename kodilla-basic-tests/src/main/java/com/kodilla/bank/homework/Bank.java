package com.kodilla.bank.homework;

public class Bank {
    CashMachine[] cashMachines;

    public Bank(int size) {
        cashMachines = new CashMachine[size];
    }

    public void deposit(int cashMachineIndex, double amount) {
        cashMachines[cashMachineIndex].depositMoney(amount);
    }

    public void withdraw(int cashMachineIndex, double amount) {
        cashMachines[cashMachineIndex].withdrawMoney(amount);
    }

    public void addMachine(int operationSize) {
        for (int i = 0; i < cashMachines.length; i++) {
            if (cashMachines[i] == null) {
                cashMachines[i] = new CashMachine(operationSize);
                return;
            }
        }
    }

    public double balance() {
        double balance = 0;
        for (CashMachine cashMachine : cashMachines) {
            if (cashMachine != null) {
                balance += cashMachine.balance();
            }
        }
        return balance;
    }

    public double depositSum() {
        double depositSum = 0;
        for (CashMachine cashMachine : cashMachines) {
            if (cashMachine != null) {
                depositSum += cashMachine.depositSum();
            }
        }
        return depositSum;
    }

    public double withdrawSum() {
        double withdrawSum = 0;
        for (CashMachine cashMachine : cashMachines) {
            if (cashMachine != null) {
                withdrawSum += cashMachine.withdrawSum();
            }
        }
        return withdrawSum;
    }

    public int depositCount() {
        int count = 0;
        for (CashMachine cashMachine : cashMachines) {
            if (cashMachine != null) {
                count += cashMachine.depositCount();
            }
        }
        return count;
    }

    public int withdrawCount() {
        int count = 0;
        for (CashMachine cashMachine : cashMachines) {
            if (cashMachine != null) {
                count += cashMachine.withdrawCount();
            }
        }
        return count;
    }

    public double averageDepositCashMachine() {
        if (depositCount() == 0) {
            return 0;
        }
        return depositSum() / depositCount();
    }

    public double averageWithdrawCashMachine() {
        if (withdrawCount() == 0) {
            return 0;
        }
        return withdrawSum() / withdrawCount();
    }
}