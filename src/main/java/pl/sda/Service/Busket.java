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
        for (int i = 0; i < basket.size(); i++) {
            price += basket.get(i).getPrice();

        }
        return price;
    }

    public void summary() {
        System.out.printf("%3s | %-10s | %5s | %20s", "id", "name", "price", "price after discount\n");

        for (int i = 0; i < basket.size(); i++) {
            System.out.printf("%3s | %-10s | %5s | %20s \n", basket.get(i).getId(), basket.get(i).getName(), basket.get(i).getPrice(), basket.get(i).discount());
        }
        System.out.println("Summa" + priceSum());
    }
}





