package pl.sda.model;

import java.util.UUID;

public class Book extends Product {

    private int pages;

    public Book(UUID id, String name, double price, int pages) {
        super(id, name, price);


        if (pages > 0) {
            this.pages = pages;
        } else {
            throw new IllegalStateException("nieprawidlowa ilosc stron");
        }
    }
}
