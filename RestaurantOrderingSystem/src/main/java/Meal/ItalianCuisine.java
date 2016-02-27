package Meal;

/**
 * Created by Piotr Dorman on 2016-02-27.
 */
public abstract class ItalianCuisine  implements Meal {

    public abstract double getPrice();

    public String getName() {
        return "Italian Cuisine";
    }
}
