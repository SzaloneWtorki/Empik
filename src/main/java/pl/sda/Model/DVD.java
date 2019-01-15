package pl.sda.Model;

import java.rmi.server.UID;
import java.time.LocalDate;

public class DVD extends Product {
    private int dateOfProduct;

    private double discountPrice = super.getPrice() - super.getPrice()*((LocalDate.now().getYear() - dateOfProduct) / 100);

    public DVD(int id, String name, double price, int dateOfProduct) {
        super(id, name, price);
        if (dateOfProduct >= 1995 && dateOfProduct <= LocalDate.now().getYear()) {
            this.dateOfProduct = dateOfProduct;

        } else {this.dateOfProduct = 0;}
    }

    @Override
    public double discount() {
        return 0;
    }
}
