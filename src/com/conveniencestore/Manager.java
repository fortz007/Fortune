package com.conveniencestore;

import enums.Role;
import interfaces.ManagerInterface;

public class Manager extends Staff implements ManagerInterface {

    public Manager() {
    }

    public Manager(Integer id, String name, Character sex, String contact, Role role) {
        super(id, name, sex, contact, role);
    }

    @Override
    public void hireCashier() {
        System.out.println("Cashier Hired");
    }
}