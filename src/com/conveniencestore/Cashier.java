package com.conveniencestore;

import enums.Role;
import interfaces.CashierInterface;

public class Cashier extends Staff implements CashierInterface {
    public Cashier() {
    }

    public Cashier(Integer id, String name, Character sex, String contact, Role role) {
        super(id, name, sex, contact, role);
    }


    @Override
    public void sellProducts() {
        System.out.println("Products Sold");
    }

    @Override
    public void dispenseReceipts() {
        System.out.println("Payment successful!");
    }
}
