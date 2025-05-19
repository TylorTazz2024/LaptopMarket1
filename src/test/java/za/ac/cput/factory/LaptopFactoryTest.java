package za.ac.cput.factory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import za.ac.cput.domain.Laptop;


public class LaptopFactoryTest {

    @Test
    public void testCreateLaptop() {

        Laptop laptop = LaptopFactory.createLaptop(
                25,
                "HP",
                "Chromebook",
                "Intel Celeron N4020, 4GB RAM, 64GB eMMC, 14-inch HD (1366 × 768)",
                4800,
                "Used - Good (no major damage or defects)"
        );

        assertNotNull(laptop);
        assertEquals(25, laptop.getLaptopID());
        assertEquals("HP", laptop.getBrand());
        assertEquals("Chromebook", laptop.getModel());
        assertEquals("Intel Celeron N4020, 4GB RAM, 64GB eMMC, 14-inch HD (1366 × 768)", laptop.getSpecifications());
        assertEquals(4800, laptop.getPrice());
        assertEquals("Used - Good (no major damage or defects", laptop.getCondition());

    }

    @Test
    public void testCreateLaptopInvalidLaptopID() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            LaptopFactory.createLaptop(-1, "HP", "Chromebook", "Intel Celeron N4020, 4GB RAM, 64GB eMMC, 14-inch HD (1366 × 768)", 4800, "Used - Good (no major damage or defects");

        });
        assertNotNull(exception);
    }

    @Test
    public void testCreateLaptopEmptySpecfications() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
           LaptopFactory.createLaptop(5, "Asus","Vivobook", "",3250, "Refurbished" );
        });
        assertNotNull(exception);
    }
}


