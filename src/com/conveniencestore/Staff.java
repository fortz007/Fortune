package com.conveniencestore;

import enums.Role;

public class Staff extends Person{
    private Role role;


    public Staff() {
    }

    public Staff(Integer id, String name, Character sex, String contact, Role role) {
        super(id, name, sex, contact);
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "role=" + role +
                '}';
    }
}
