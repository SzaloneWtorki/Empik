package pl.sda.model;

import java.util.UUID;

public class Book extends Product {

    int pages;

    public Book(UUID id, String name, double price, int pages) {
        super(id, name, price);
        if (pages > 0){

            this.pages = pages;
        } else {
            throw new IllegalArgumentException("Nieprawidlowa ilosc stron");
        }

    }
}
