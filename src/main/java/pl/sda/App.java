package pl.sda;

import pl.sda.model.Book;
import pl.sda.model.Cd;
import pl.sda.model.Product;
import pl.sda.service.Basket;

import java.time.LocalDate;

public class App
{
    public static void main( String[] args )
    {
        Basket basket = new Basket();

        basket.add(new Book(12, "Potter", 12.36, 36));
        basket.add(new Cd(6, "LP", 32.99, 2015));
        basket.add(new Book(7, "Harry P", 199.99, 200));

        basket.summary();

    }
}
