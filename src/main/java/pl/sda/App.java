package pl.sda;

import pl.sda.Model.Book;
import pl.sda.Model.CD;
import pl.sda.Service.BasketService;
import pl.sda.Service.Busket;

import java.rmi.server.UID;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Busket busket = new Busket();
        busket.addProduct(new Book(1, "Arkcham", 2.0, 14));
        busket.addProduct(new CD(2, "Pac Man", 15.39, 2000));
        busket.addProduct(new CD(3, "ISQB",29.90,1999));
        busket.summary();
    }
}
