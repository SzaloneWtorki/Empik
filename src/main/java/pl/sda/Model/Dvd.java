package pl.sda.Model;

import java.time.LocalDate;
import java.util.UUID;

public class Dvd extends Product {

    int dateOfProduct;

    public Dvd(UUID id, String name, double price, int dateOfProduct) {
        super(id, name, price);
        if (dateOfProduct >= 1995 && dateOfProduct <= LocalDate.now().getYear())
        {this.dateOfProduct = dateOfProduct;}
        else
            dateOfProduct = 0;
    }
}
