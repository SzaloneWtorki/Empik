package pl.sda.model;

import java.time.LocalDate;

public class Cd extends Product {

    private int dateOfProduction;
    private double discountPrice = super.getPrice() - ((LocalDate.now().getYear() - dateOfProduction) / 100);

    public Cd(int id, String name, double price, int dateOfProduction) {
        super(id, name, price);

        if(dateOfProduction >= 1982 && dateOfProduction <= LocalDate.now().getYear()) {
            this.dateOfProduction = dateOfProduction;
        } else {
            this.dateOfProduction = 0;
        }
    }

    @Override
    public double discount() {
        return discountPrice;
    }
}
