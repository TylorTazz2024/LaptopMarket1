package za.ac.cput.factory;

import za.ac.cput.domain.Order;
import java.util.Date;

public class OrderFactory {
    public static Order createOrder(int orderID, int userID, Date orderDate, String status, double totalAmount) {
        if (orderDate == null || status == null || status.isEmpty() || totalAmount < 0) {
            throw new IllegalArgumentException("Invalid input values for Order creation.");
        }

        return new Order.OrderBuilder()
                .setOrderID(orderID)
                .setUserID(userID)
                .setOrderDate(new Date(orderDate.getTime()))
                .setStatus(status)
                .setTotalAmount(totalAmount)
                .build();
    }
}
