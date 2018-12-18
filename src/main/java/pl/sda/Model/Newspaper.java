package pl.sda.Model;

import java.rmi.server.UID;

public class Newspaper extends Product {
    public Newspaper(UID id, String name, double price) {
        super(id, name, price);
    }
}
