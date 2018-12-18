package pl.sda.Model;

import java.util.UUID;

public class Product {

    private UUID id;
    private String name;
    private double price;

    public Product(UUID id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
