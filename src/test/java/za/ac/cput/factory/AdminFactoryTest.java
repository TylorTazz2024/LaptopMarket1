package za.ac.cput.factory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Admin;

import static org.junit.jupiter.api.Assertions.*;

class AdminFactoryTest {

    Admin validAdmin;
    Admin nullIdAdmin;
    Admin emptyStaffNumberAdmin;
    Admin emptyDepartmentAdmin;

    @BeforeEach
    void setUp() {
        validAdmin = AdminFactory.createAdmin(1L, "STF123456", "Information Technology");
        nullIdAdmin = AdminFactory.createAdmin(null, "STF123456", "Information Technology");
        emptyStaffNumberAdmin = AdminFactory.createAdmin(2L, "", "Finance");
        emptyDepartmentAdmin = AdminFactory.createAdmin(3L, "STF789012", "");
    }

    @AfterEach
    void tearDown() {
        validAdmin = null;
        nullIdAdmin = null;
        emptyStaffNumberAdmin = null;
        emptyDepartmentAdmin = null;
    }

    @Test
    void createAdmin() {
        assertNotNull(validAdmin);
        System.out.println("✅ Created Admin: " + validAdmin);

        assertNull(nullIdAdmin);
        System.out.println("❌ Should fail (null adminID): " + nullIdAdmin);

        assertNull(emptyStaffNumberAdmin);
        System.out.println("❌ Should fail (empty staff number): " + emptyStaffNumberAdmin);

        assertNull(emptyDepartmentAdmin);
        System.out.println("❌ Should fail (empty department): " + emptyDepartmentAdmin);
    }
}
