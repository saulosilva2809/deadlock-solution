package com.saulo;

public class PaymentService {

    public void transfer(
            Account origin,
            Account destination,
            double amount
    ) {
        if (origin.getId().equals(destination.getId())) {
            throw new IllegalArgumentException("As contas devem ser diferentes");
        }

        // descobre qual conta deve ser bloqueada primeiro
        Account firstLock;
        Account secondLock;

        if (origin.getId() < destination.getId()) {
            firstLock = origin;
            secondLock = destination;
        } else {
            firstLock = destination;
            secondLock = origin;
        }

        synchronized (firstLock) {
            System.out.println(
                    Thread.currentThread().getName()
                            + " bloqueou " + firstLock.getOwner()
            );

            synchronized (secondLock) {
                System.out.println(
                        Thread.currentThread().getName()
                                + " bloqueou " + secondLock.getOwner()
                );

                origin.withdraw(amount);
                destination.deposit(amount);

                System.out.println(
                        Thread.currentThread().getName()
                                + " realizou a transferência!"
                );
            }
        }
    }
}
