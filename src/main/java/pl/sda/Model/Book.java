package pl.sda.Model;

import java.rmi.server.UID;

public class Book extends Product {
    private int page;


    public Book(UID id, String name, double price, int page) {
        super(id, name, price);
        if (page > 0) {
            this.page = page;
        } else {
            throw new IllegalArgumentException("Not found");
        }
    }
}
