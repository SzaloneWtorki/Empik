package pl.sda.Model;

import java.rmi.server.UID;

public class Product {
    private UID id;
    private  String name;
    private double price;

    public Product(UID id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
