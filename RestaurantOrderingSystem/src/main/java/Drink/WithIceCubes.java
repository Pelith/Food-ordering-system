package Drink;

/**
 * Created by Piotr Dorman on 2016-02-27.
 */
public class WithIceCubes extends DrinkDecorator {
    public WithIceCubes(Drink d) {
        super(d);
    }

    public double getPrice() { // Overriding methods defined in the abstract superclass
        return super.getPrice() + 0.1;
    }

    public String getName() {
        return super.getName() + " + Ice Cubes";
    }
}