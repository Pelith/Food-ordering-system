package Meal;

/**
 * Created by Piotr Dorman on 2016-02-27.
 */
public class ItalianDish extends ItalianCuisine {

    public double getPrice()
    {
        return 17.3;
    }

    public String getName()
    {
        return "Italian dish from " + super.getName();
    }
}
