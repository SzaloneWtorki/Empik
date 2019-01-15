package pl.sda.service;

import pl.sda.model.Cd;
import pl.sda.model.Poster;
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
            price += basket.get(i).discount();
        }
        return price;
    }

    public void summary() {
        pricePoster();
        System.out.printf("%3s | %-10s | %5s | %20s", "id", "name", "price", "price after discount\n");
        for (int i = 0; i < basket.size(); i++) {
            System.out.printf("%3s | %-10s | %5s | %20s\n", basket.get(i).getId(), basket.get(i).getName(), basket.get(i).getPrice(), basket.get(i).discount());
        }
        System.out.println(priceSum());

    }

    public void pricePoster() {
        int numberOfPosters = 0;
        double lowestPrice = 0.0;
        for (int i = 0; i < basket.size(); i++) {
            if (basket.get(i) instanceof Poster) {
                numberOfPosters++;
                if (basket.get(i).getPrice() < lowestPrice || lowestPrice == 0.0) {
                    lowestPrice = basket.get(i).getPrice();
                }
            }
        }
        if (numberOfPosters >= 3) {
            for (int i = 0; i < basket.size(); i++) {
                if (basket.get(i) instanceof Poster && basket.get(i).getPrice() == lowestPrice) {
                    ((Poster) basket.get(i)).setDiscount(true);
                    return;
                }
            }
        }
    }
}
