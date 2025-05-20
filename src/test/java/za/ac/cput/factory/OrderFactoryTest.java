package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import za.ac.cput.domain.Order;

import java.util.Date;

class OrderFactoryTest {

    @Test
    void createOrder_validInput_shouldCreateOrderSuccessfully() {
        int orderID = 1001;
        int userID = 501;
        Date orderDate = new Date();
        String status = "Pending";
        double totalAmount = 250.75;

        Order order = OrderFactory.createOrder(orderID, userID, orderDate, status, totalAmount);

        assertNotNull(order);
        assertEquals(orderID, order.getOrderID());
        assertEquals(userID, order.getUserID());
        assertEquals(orderDate, order.getOrderDate());
        assertEquals(status, order.getStatus());
        assertEquals(totalAmount, order.getTotalAmount(), 0.01);
    }

    @Test
    void createOrder_invalidTotalAmount_shouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                OrderFactory.createOrder(1002, 502, new Date(), "Pending", -100.00)
        );

        assertEquals("Invalid input values for Order creation.", exception.getMessage());
    }

    @Test
    void createOrder_nullOrderDate_shouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                OrderFactory.createOrder(1003, 503, null, "Completed", 300.00)
        );

        assertEquals("Invalid input values for Order creation.", exception.getMessage());
    }
}
