package Drink;

/**
 * Created by Piotr Dorman on 2016-02-27.
 */
public class WithLemon extends DrinkDecorator {
    public WithLemon(Drink d) {
        super(d);
    }

    public double getPrice() { // Overriding methods defined in the abstract superclass
        return super.getPrice() + 0.2;
    }

    public String getName() {
        return super.getName() + " + Lemon";
    }
}