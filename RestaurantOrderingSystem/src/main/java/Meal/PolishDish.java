package Meal;

/**
 * Created by Piotr Dorman on 2016-02-27.
 */
public class PolishDish extends PolishCuisine {

    public double getPrice()
    {
        return 15.5;
    }

    public String getName()
    {
        return "Polish dish from " + super.getName();
    }

}
