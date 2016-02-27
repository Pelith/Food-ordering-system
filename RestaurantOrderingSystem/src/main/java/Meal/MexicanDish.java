package Meal;

/**
 * Created by Piotr Dorman on 2016-02-27.
 */
public class MexicanDish extends MexicanCuisine {

    public double getPrice()
    {
        return 20.0;
    }

    public String getName()
    {
        return "Mexican dish from " + super.getName();
    }

}
