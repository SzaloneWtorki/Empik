package pl.sda.Service;

import pl.sda.Model.Product;

import java.util.HashMap;
import java.util.Map;

public class Busket {
    private Map<Integer, Product> basket = new HashMap<>();
    private int counter = 0;

    public Busket() {
    }

    public void addProduct(Product product) {
        basket.put(counter, product);
        counter++;
    }

    public void removeProduct(int id) {
        basket.remove(id);

    }

    public double priceSum() {
        double price = 0;
        for (double i = 0.0; i < basket.size(); i++) {
            price += basket.get(i).getPrice();

        }
        return price;
    }
}