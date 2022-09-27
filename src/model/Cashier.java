package model;

import enums.Role;
import interfaces.CashierInterface;

public class Cashier extends Staff implements CashierInterface {
    public Cashier() {
    }

    public Cashier(Integer id, String name, Character sex, String contact, Role role) {
        super(id, name, sex, contact, role);
    }


    @Override
    public String sellProducts() {
        return "Products Sold";
    }

    @Override
    public String dispenseReceipts() {
        return "Payment successful!";
    }
}
