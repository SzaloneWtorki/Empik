package pl.sda.Service;

import pl.sda.Model.Poster;
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

    public void posterDicountPrice() {
        int numberOfposters = 0;
        double posterLowerPrice = 0.0;
        for (int i = 0; i < basket.size(); i++) {

            if (basket.get(i) instanceof Poster) {
                numberOfposters++;
                if (basket.get(i).getPrice() < posterLowerPrice || posterLowerPrice == 0.0) {
                    posterLowerPrice = basket.get(i).getPrice();
                }
            }
        }
        if (numberOfposters >= 3) {
            for (int i = 0; i < basket.size(); i++) {
                if (basket.get(i) instanceof Poster && basket.get(i).getPrice() == posterLowerPrice) {
                    ((Poster) basket.get(i)).setDiscount(true);
                    return;

                }
            }
        }
    }

    public double priceSum() {
        double price = 0;
        for (int i = 0; i < basket.size(); i++) {
            price += basket.get(i).discount();

        }
        return price;
    }

    public void summary() {
        posterDicountPrice();
        System.out.printf("%3s | %-10s | %5s | %20s", "id", "name", "price", "price after discount\n");

        for (int i = 0; i < basket.size(); i++) {
            System.out.printf("%3s | %-10s | %5s | %20s \n", basket.get(i).getId(), basket.get(i).getName(), basket.get(i).getPrice(), basket.get(i).discount());
        }
        posterDicountPrice();
        System.out.println("Summa" + priceSum());

    }
}





