package pl.sda.Model;

import java.rmi.server.UID;

public class Newspaper extends Product  {
    public Newspaper(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double discount() {
        return 0;
    }
}
