package pl.sda.Model;

import java.rmi.server.UID;
import java.time.LocalDate;

public class Book extends Product {
    private int page;
    private int discountPrice;



    public Book(int id, String name, double price, int page) {
        super(id, name, price);
        if (page > 0) {
            this.page = page;
        } else {
            throw new IllegalArgumentException("Not found");
        }
    }

    @Override
    public double discount() {
        if (page / 100 > 0 && page / 100 <= 4) {
            discountPrice = (int) (getPrice() - getPrice() * 0.1 * (page / 100));
        } else if (page / 100 > 4) {
            discountPrice = (int) (getPrice() - getPrice() * 0.4);
        } else {
            discountPrice = (int) getPrice();
        }
        return discountPrice ;
    }
}
