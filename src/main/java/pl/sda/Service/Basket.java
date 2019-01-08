package pl.sda.Service;

import pl.sda.Model.Cd;
import pl.sda.Model.Dvd;
import pl.sda.Model.Product;

import java.util.HashMap;
import java.util.Map;

public class Basket {

    int numberOfProductInBasket = 0;
    private Map<Integer, Product> basketMap = new HashMap<>();

   public void add (Product product)
   {
       basketMap.put(numberOfProductInBasket, product);
       numberOfProductInBasket++;
   }

   public void delete (int numberOfProductInBasket)
   {
       basketMap.remove(numberOfProductInBasket);
   }

   public double priceSum ()
   {
       double price = 0;

       for (int i = 0; i < basketMap.size(); i++)
       {
           price += basketMap.get(i).getPrice();
       }

       return price;
   }

   public void summary ()
   {
       System.out.printf("%3s | %-10s | %5s | %20s", "id", "name", "price", "price after discount\n");


           for (int i = 0; i < basketMap.size(); i++) {
               System.out.printf("%3s | %-10s | %5s | %20s\n", basketMap.get(i).getId(), basketMap.get(i).getName(), basketMap.get(i).getPrice(), "price after discount\n");
           }

       System.out.println(priceSum());



   }

   public double discount (Product product)
   {
       if(product.getClass().getName().equals("Cd") || product.getClass().getName().equals("Dvd"))
       {
           product = (Cd) product;

          double i =  ((Cd) product).getData();
       }
   }
   }


