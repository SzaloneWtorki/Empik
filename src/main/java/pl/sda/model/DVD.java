package pl.sda.model;

import java.time.LocalDate;
import java.util.UUID;

public class DVD extends Product {

    private int dateOfProduction;

    public DVD(UUID id, String name, double price, int dateOfProduction) {
        super(id, name, price);
        if (dateOfProduction >= 1995 && dateOfProduction <= LocalDate.now().getYear()) {
            this.dateOfProduction = dateOfProduction;
        } else {
            this.dateOfProduction = 0;
        }
    }
}
