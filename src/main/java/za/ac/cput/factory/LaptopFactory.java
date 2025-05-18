package za.ac.cput.factory;
import za.ac.cput.domain.Laptop;


public class LaptopFactory {

    public static Laptop createLaptop(int laptopID, String brand, String model, String specifications, double price, String condition) {
        if (laptopID < 0)
            return null;

        if (brand.isEmpty()|| brand == null)
            return null;

        if (model.isEmpty()|| model == null)
            return null;

        if (specifications.isEmpty()|| specifications == null)
            return null;

        if (price < 0)
            return null;

        if(condition.isEmpty() || condition == null)
            return null;

        return new Laptop.Builder()
                .setLaptopID(laptopID)
                .setBrand(brand)
                .setModel(model)
                .setSpecifications(specifications)
                .setPrice(price)
                .setCondition(condition)
                .build();

    }

}
