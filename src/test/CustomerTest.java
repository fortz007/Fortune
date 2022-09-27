package test;

import model.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Customer customer = new Customer();
    @Test
    void buyProducts() {
        String actBuy = customer.buyProducts();
        String expBuy = "Product purchased";

        assertEquals(expBuy,actBuy);
    }
}