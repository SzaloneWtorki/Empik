package pl.sda.Model;

import java.rmi.server.UID;

public class Vinyl extends Product {

    public Vinyl(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double discount() {
        return 0;
    }
}
