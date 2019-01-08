package pl.sda;

import pl.sda.Model.Book;
import pl.sda.Model.Cd;
import pl.sda.Service.Basket;

public class App 
{
    public static void main( String[] args )
    {
        Basket basket = new Basket();

        basket.add(new Book(1, "ksiazka", 10.6, 100 ));
        basket.add(new Cd(2,"plyta",22.2, 200));

        basket.summary();
    }
}
