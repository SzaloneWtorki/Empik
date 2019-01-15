package pl.sda.model;

import java.time.LocalDate;

public class Cd extends Product {

    private int dateOfProduction;


    public Cd(int id, String name, double price, int dateOfProduction) {
        super(id, name, price);

        if (dateOfProduction >= 1982 && dateOfProduction <= LocalDate.now().getYear()) {
            this.dateOfProduction = dateOfProduction;
        } else {
            this.dateOfProduction = 0;
        }
    }

    @Override
    public double discount() {
        double discountPrice = super.getPrice() - super.getPrice() * ((LocalDate.now().getYear() - dateOfProduction) / 100.0);
        return discountPrice;
    }
}

