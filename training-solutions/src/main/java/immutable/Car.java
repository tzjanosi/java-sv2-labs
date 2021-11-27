package immutable;

import java.time.LocalDate;

public class Car {
    private String brand;
    private String model;
    private int YearOfProduction;


    public Car(String brand, String model, int getYearOfProduction) {
        if (brand == null || brand.isEmpty()) {
            throw new IllegalArgumentException("Brand name cannot be empty!");
        }
        int year = LocalDate.now().getYear();
        if (getYearOfProduction>LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Year of production cannot be in the future!");
        }
        this.brand = brand;
        this.model = model;
        this.YearOfProduction = getYearOfProduction;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return YearOfProduction;
    }
}
