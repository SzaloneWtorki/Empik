package pl.sda.Model;

import java.time.LocalDate;


public class Cd extends Product implements Discount {

    protected int dateOfProduct;

    public Cd(int id, String name, double price, int dateOfProduct) {
        super(id, name, price);
        if (dateOfProduct >= 1982 && dateOfProduct <= LocalDate.now().getYear())
        {this.dateOfProduct = dateOfProduct;}
        else
            dateOfProduct = 0;


        double price2 = discount();

    }

    public int getData()
    {
        return dateOfProduct;
    }

    @Override
    public double discount() {
        return getPrice() - (dateOfProduct / 1000);
    }
}
