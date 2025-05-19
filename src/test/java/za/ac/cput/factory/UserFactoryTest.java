package za.ac.cput.factory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.User;

import static org.junit.jupiter.api.Assertions.*;

class UserFactoryTest {

    User validUser;
    User invalidUserID;
    User emptyFirstname;
    User invalidEmail;
    User invalidPhone;
    User invalidRole;

    @BeforeEach
    void setUp() {
        validUser = UserFactory.createUser(
                1001,
                "Tandile",
                "tandile@example.com",
                "0821234567",
                "admin"
        );

        invalidUserID = UserFactory.createUser(
                -5,
                "Tandile",
                "tandile@example.com",
                "0821234567",
                "user"
        );

        emptyFirstname = UserFactory.createUser(
                1002,
                "",
                "tandile@example.com",
                "0821234567",
                "admin"
        );

        invalidEmail = UserFactory.createUser(
                1003,
                "Tandile",
                "invalid-email",
                "0821234567",
                "user"
        );

        invalidPhone = UserFactory.createUser(
                1004,
                "Tandile",
                "tandile@example.com",
                "12345",
                "admin"
        );

        invalidRole = UserFactory.createUser(
                1005,
                "Tandile",
                "tandile@example.com",
                "0821234567",
                "guest"
        );
    }

    @AfterEach
    void tearDown() {
        validUser = null;
        invalidUserID = null;
        emptyFirstname = null;
        invalidEmail = null;
        invalidPhone = null;
        invalidRole = null;
    }

    @Test
    void createUser() {
        assertNotNull(validUser);
        System.out.println("✅ Created valid user: " + validUser);

        assertNull(invalidUserID);
        System.out.println("❌ Should fail (invalid user ID): " + invalidUserID);

        assertNull(emptyFirstname);
        System.out.println("❌ Should fail (empty first name): " + emptyFirstname);

        assertNull(invalidEmail);
        System.out.println("❌ Should fail (invalid email): " + invalidEmail);

        assertNull(invalidPhone);
        System.out.println("❌ Should fail (invalid phone): " + invalidPhone);

        assertNull(invalidRole);
        System.out.println("❌ Should fail (invalid role): " + invalidRole);
    }
}
