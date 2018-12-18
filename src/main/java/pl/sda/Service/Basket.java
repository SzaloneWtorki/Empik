package pl.sda.Service;

import pl.sda.Model.Product;

import java.util.HashMap;
import java.util.Map;

public class Basket {

    int numberOfProductInBasket = 0;
    private Map<Integer, Product> basket = new HashMap<>();

   public void add (Product product)
   {
       basket.put(numberOfProductInBasket, product);]
       numberOfProductInBasket++;
   }

   public void delete (int numberOfProductInBasket)
   {
       basket.remove(numberOfProductInBasket);
   }

   public double priceSum ()
   {
       double price = 0;

       for (int i = 0; i < basket.size(); i++)
       {
           price += basket.get(i).getPrice();
       }

       return price;
   }


}
