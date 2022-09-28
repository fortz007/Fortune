package test;

import model.Cashier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CashierTest {

    Cashier cashier = new Cashier();
    @Test
    void sellProducts() {
       String expBuy = cashier.sellProducts();
       String actBuy = "Products Sold";

        assertEquals(expBuy,actBuy);
    }

    @Test
    void dispenseReceipts() {
        String actBuy = cashier.dispenseReceipts();
        String expBuy = "Payment successful!";

        assertEquals(expBuy,actBuy);
    }
}