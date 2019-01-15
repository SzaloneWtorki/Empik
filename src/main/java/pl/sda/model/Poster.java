package pl.sda.model;

import lombok.Data;

@Data

public class Poster extends Product {
    private boolean discount = false;

    public Poster(int id, String name, double price) {
        super(id, name, price);
    }
    @Override
    public double discount() {
        if (discount) {
            return 1.0;
        }
        return getPrice();
    }
}
