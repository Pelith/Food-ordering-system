package Drink;

/**
 * Created by Piotr Dorman on 2016-02-27.
 */
public abstract class DrinkDecorator implements Drink{
    protected final Drink decoratedDrink;

    public DrinkDecorator(Drink d) {
        this.decoratedDrink = d;
    }

    public double getPrice() {
        return decoratedDrink.getPrice();
    }

    public String getName() {
        return decoratedDrink.getName();
    }
}




