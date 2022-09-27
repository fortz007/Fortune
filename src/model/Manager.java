package model;

import enums.Grade;
import enums.Role;
import interfaces.ManagerInterface;

public class Manager extends Staff implements ManagerInterface {

    public Manager() {
    }

    public Manager(Integer id, String name, Character sex, String contact, Role role) {
        super(id, name, sex, contact, role);
    }


    @Override
    public String hireCashier(Applicant applicant) {
        String  response = "";
        if (applicant.hasApplied()){
            if (applicant.getGrade().equals(Grade.FIRST_CLASS) || applicant.getGrade().equals(Grade.SECOND_CLASS_UPPER)){
                response = "YOU ARE HIRED!";
            }else
                response = "SORRY, YOU ARE NOT QUALIFIED!";
        }
        return response;
    }

    @Override
    public String toString() {
        return "Manager{} " + super.toString();
    }
}