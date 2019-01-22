package pl.sda.Model;

import java.rmi.server.UID;

public class Poster extends Product{
    public Poster(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double discount() {
        return 0;
    }
}
