package pl.sda.model;

import pl.sda.enumy.GamesProducents;

import java.util.UUID;

public class Game extends Product {
    private GamesProducents gamesProducent;

    public Game(int id, String name, double price, GamesProducents gamesProducent) {
        super(id, name, price);
        this.gamesProducent = gamesProducent;
    }
}
