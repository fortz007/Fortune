package test;

import model.Cashier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CashierTest {

    Cashier cashier = new Cashier();
    @Test
    void sellProducts() {
       String expBuy = cashier.sellProducts();
       String actBuy = "Product Sold";

        assertEquals(expBuy,actBuy);
    }

    @Test
    void dispenseReceipts() {
        String expBuy = cashier.dispenseReceipts();
        String actBuy = "Payment Successful";

        assertEquals(expBuy,actBuy);
    }
}