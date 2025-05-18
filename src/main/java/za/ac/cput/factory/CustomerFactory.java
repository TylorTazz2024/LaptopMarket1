package za.ac.cput.factory;

import za.ac.cput.domain.Customer;

public class CustomerFactory {


        public static Customer createCustomer(String shippingAddress) {
            if (shippingAddress.isEmpty() || shippingAddress == null)
                return null;
            return new Customer.Builder().setShippingAddress(shippingAddress).build();
        }

    }

