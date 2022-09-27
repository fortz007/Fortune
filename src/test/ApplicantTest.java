package test;

import enums.Grade;
import model.Applicant;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicantTest {

    Applicant applicant = new Applicant(1, "Faith", 'M', "Decagon", "Cashier", Grade.SECOND_CLASS_UPPER);


    @Test
    void apply() {
        String actBuy = applicant.apply();
        String expBuy = "I am applying for the job";

        assertEquals(expBuy,actBuy);
    }

    @Test
    void hasApplied() {
        Boolean actBuy = applicant.hasApplied();
        Boolean expBuy = true;

        assertEquals(expBuy,actBuy);
    }
}