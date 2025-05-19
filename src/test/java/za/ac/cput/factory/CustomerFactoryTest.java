package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Customer;

import static org.junit.jupiter.api.Assertions.*;

class CustomerFactoryTest {
    @Test
    public void testCreateCustomer() {
        Customer customer = new Customer.Builder().setShippingAddress("39 Siko street").build();
        assertNotNull(customer);
        System.out.println(customer.toString());


    }

}