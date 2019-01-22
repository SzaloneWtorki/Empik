package pl.sda.Model;

import pl.sda.Enumy.GamesProducents;

import java.rmi.server.UID;

public class Game extends Product {
    private GamesProducents gamesProducents;

    public Game(int id, String name, double price, GamesProducents gamesProducents) {
        super(id, name, price);
        this.gamesProducents = gamesProducents;
    }

    @Override
    public double discount() {
        return 0;
    }
}
