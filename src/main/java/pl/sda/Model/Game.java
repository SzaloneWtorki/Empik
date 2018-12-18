package pl.sda.Model;

import pl.sda.Enumy.Producents;

import java.util.UUID;

public class Game extends Product {

    public Game(UUID id, String name, double price, Producents producents) {
        super(id, name, price);

    }
}
