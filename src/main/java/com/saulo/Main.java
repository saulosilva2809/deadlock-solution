package com.saulo;

import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        Account accountA = new Account(Long.valueOf(10), "Conta A", 1000);
        Account accountB = new Account(Long.valueOf(20), "Conta B", 2000);

        PaymentService paymentService = new PaymentService();

        Thread payment1 = new Thread(() ->
                paymentService.transfer(
                        accountA,
                        accountB,
                        100
                ), "Payment-1"
        );

        Thread payment2 = new Thread(() ->
                paymentService.transfer(
                        accountB,
                        accountA,
                        200
                ), "Payment-2"
        );

        payment1.start();
        payment2.start();
    }
}