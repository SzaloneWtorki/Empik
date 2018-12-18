package pl.sda.service;

import pl.sda.model.Product;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    private Map<Integer, Product> basket = new HashMap<>();
    private int counter = 0;

    public Basket() {
    }

    public void add(Product product) {
        basket.put(counter, product);
        counter++;
    }

    public void remove(int id) {
        basket.remove(id);
    }

    public double priceSum() {
        double price = 0;
        for (int i = 0; i < basket.size(); i++) {
            price += basket.get(i).getPrice();
        }
        return price;
    }
}
