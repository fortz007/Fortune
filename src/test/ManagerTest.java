package test;

import enums.Grade;
import model.Applicant;
import model.Manager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    Manager manager = new Manager();
    Applicant applicant = new Applicant("cashier", Grade.FIRST_CLASS);

    @Test
    void hireCashier() {
        String actBuy = "YOU ARE HIRED!";
        String expBuy = manager.hireCashier(applicant);

        assertEquals(expBuy,actBuy);
    }
}