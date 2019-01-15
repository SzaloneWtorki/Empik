package pl.sda;

import pl.sda.model.Book;
import pl.sda.model.Cd;
import pl.sda.model.Poster;
import pl.sda.service.Basket;

public class App {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add(new Book(1,"ksiazka", 100,140));
        basket.add(new Cd(2,"CD", 100,2000));
        basket.summary();

        basket.add((new Poster(1,"poster1",666.5)));
        basket.add((new Poster(2,"poster2",666)));
        basket.add((new Poster(3,"poster3",111)));
    }
}
