package pl.sda;

import pl.sda.Model.Book;
import pl.sda.Model.CD;
import pl.sda.Model.Poster;
import pl.sda.Service.BasketService;
import pl.sda.Service.Busket;

import java.rmi.server.UID;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Busket busket = new Busket();
        busket.addProduct(new Book(1, "Arkcham", 34, 140));

        busket.addProduct(new CD(2, "Pac Man", 100, 2000));
        busket.addProduct(new CD(3, "ISQB",1000,2000));

        busket.addProduct(new Poster(4,"Star Wars", 90));
        busket.addProduct(new Poster(5,"Barakuda", 50));
        busket.addProduct(new Poster(6,"Bings ", 70));

        busket.summary();
    }
}
