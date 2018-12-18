package pl.sda.Model;

import java.util.UUID;

public class Book extends Product {

    int numberOfPaces;

    public Book(UUID id, String name, double price, int numberOfPaces) {
        super(id, name, price);
        if (numberOfPaces > 0 )
        {
            this.numberOfPaces = numberOfPaces;
        }
        else
            throw new IllegalArgumentException("Nieprawidlowa ilosc stron");

    }
}
