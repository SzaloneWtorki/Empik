package pl.sda.Model;

import java.rmi.server.UID;

public class Mug extends Product {
    public Mug(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double discount() {
        return 0;
    }
}
