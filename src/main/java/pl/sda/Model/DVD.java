package pl.sda.Model;

import java.rmi.server.UID;
import java.time.LocalDate;

public class DVD extends Product {
    private int dateOfProduct;

    public DVD(UID id, String name, double price, int dateOfProduct) {
        super(id, name, price);
        if (dateOfProduct >= 1995 && dateOfProduct <= LocalDate.now().getYear()) {
            this.dateOfProduct = dateOfProduct;

        } else {this.dateOfProduct = 0;}
    }
}
