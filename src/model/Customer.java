package model;

import interfaces.CustomerInterface;

public class Customer extends Person implements CustomerInterface {
    public Customer() {
    }

    public Customer(Integer id, String name, Character sex, String contact) {
        super(id, name, sex, contact);
    }

    @Override
    public String buyProducts() {
        return "Product purchased";
    }
}
