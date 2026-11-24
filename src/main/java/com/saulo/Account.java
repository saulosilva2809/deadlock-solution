package com.saulo;

public class Account {

    private final Long id;
    private final String owner;
    private double balance;

    public Account(Long id, String owner, double balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }

        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}