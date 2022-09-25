package com.conveniencestore;

import interfaces.ApplicantInterface;

public class Applicant extends Person implements ApplicantInterface {
    private String position;

    public Applicant(String position) {
        this.position = position;
    }

    public Applicant(Integer id, String name, Character sex, String contact, String position) {
        super(id, name, sex, contact);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void applyForCashierPosition() {
        System.out.println("Application Successful!");
    }
}
