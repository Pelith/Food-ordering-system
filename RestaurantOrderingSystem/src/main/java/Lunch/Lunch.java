package Lunch;
import Meal.Meal;
/**
 * Created by Piotr Dorman on 2016-02-27.
 */
public class Lunch {

    private final Meal mainCourse;
    private final Meal dessert;

    public Lunch()
    {
        this.mainCourse = null;
        this.dessert = null;
    }

    public Lunch(Meal mC, Meal d)
    {
        this.mainCourse = mC;
        this.dessert = d;
    }

    public double getPrice()
    {
        return mainCourse.getPrice() + dessert.getPrice();
    }

    public String getName()
    {
        return mainCourse.getName() + " and " + dessert.getName();
    }
}
