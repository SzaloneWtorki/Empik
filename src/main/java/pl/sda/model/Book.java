package pl.sda.model;

import java.util.UUID;

public class Book extends Product {

    private int pages;
    private double discountPrice;

    @Override
    public double discount() {
        if (pages / 100 > 0 && pages / 100 <= 4) {
            discountPrice = getPrice() - getPrice() * 0.1 * (pages / 100);
        } else if (pages / 100 > 4) {
            discountPrice = getPrice() - getPrice() * 0.4;
        } else {
            discountPrice = getPrice();
        }
        return discountPrice;
    }

    public Book(int id, String name, double price, int pages) {
        super(id, name, price);


        if (pages > 0) {
            this.pages = pages;
        } else {
            throw new IllegalStateException("nieprawidlowa ilosc stron");
        }
    }

}
