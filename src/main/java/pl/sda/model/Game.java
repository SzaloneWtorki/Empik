package pl.sda.model;

import pl.sda.enumy.GamesProducents;

import java.util.UUID;

public class Game extends Product{

    private GamesProducents gamesProducents;

    public Game(UUID id, String name, double price, GamesProducents gamesProducents) {
        super(id, name, price);
        this.gamesProducents = gamesProducents;
    }


}
