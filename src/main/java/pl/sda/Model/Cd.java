package pl.sda.Model;

import java.time.LocalDate;
import java.util.UUID;

public class Cd extends Product {

    private int dateOfProduct;

    public Cd(UUID id, String name, double price, int dateOfProduct) {
        super(id, name, price);
        if (dateOfProduct >= 1982 && dateOfProduct <= LocalDate.now().getYear())
        {this.dateOfProduct = dateOfProduct;}
        else
            dateOfProduct = 0;

    }


}
