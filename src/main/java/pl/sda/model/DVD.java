package pl.sda.model;

import java.time.LocalDate;
import java.util.UUID;

public class DVD extends Product {

    private int dateOfProduction;
    private double discountPrice = super.getPrice() - super.getPrice()*((LocalDate.now().getYear() - dateOfProduction) / 100.0);

    public DVD(int id, String name, double price, int dateOfProduction) {
        super(id, name, price);
        if (dateOfProduction >= 1995 && dateOfProduction <= LocalDate.now().getYear()) {
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
