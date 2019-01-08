package pl.sda;

import pl.sda.model.Book;
import pl.sda.model.Cd;
import pl.sda.service.Basket;

public class App {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add(new Book(1,"ksiazka", 2,14));
        basket.add(new Cd(2,"CD", 100,2000));
        basket.summary();
    }
}
