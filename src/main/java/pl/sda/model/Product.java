package pl.sda.Model;

import lombok.Data;

import java.rmi.server.UID;

@Data
public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double discount() {

        return price;

    }

}
