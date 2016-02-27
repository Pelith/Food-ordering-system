package Meal;

/**
 * Created by Piotr Dorman on 2016-02-27.
 */
public abstract class MexicanCuisine implements Meal {


    public abstract double getPrice();

    public String getName() {
        return "Mexican Cuisine";
    }
}
