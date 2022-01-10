package collectionslist;

import java.time.LocalDate;

public class Food {
    private String name;
    private LocalDate dateOfExpiration;

    public Food(String name, LocalDate dateOfExpiration) {
        this.name = name;
        this.dateOfExpiration = dateOfExpiration;
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpirationDate() {
        return dateOfExpiration;
    }
}
