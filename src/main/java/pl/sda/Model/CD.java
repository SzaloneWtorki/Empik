package pl.sda.Model;

import java.rmi.server.UID;
import java.time.LocalDate;

public class CD extends Product {


    private int dateOfProduction;
    private double discountPrice = getPrice() - getPrice() * ((LocalDate.now().getYear() - dateOfProduction) / 100.0);


    public CD(int id, String name, double price, int dateOfProduction) {
        super(id, name, price);

        if (dateOfProduction >= 1982 && dateOfProduction <= LocalDate.now().getYear()) {
            this.dateOfProduction = dateOfProduction;
        } else {
            this.dateOfProduction = 0;
        }
    }

    @Override
    public double discount() {
        double discountPrice = getPrice() - getPrice() * ((LocalDate.now().getYear() - dateOfProduction) / 100.0);
        return discountPrice;
    }
}






