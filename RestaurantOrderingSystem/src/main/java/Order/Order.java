package Order;
import Drink.Drink;
import Lunch.Lunch;
/**
 * Created by Piotr Dorman on 2016-02-27.
 */
public class Order {

    private Drink drink = null;
    private Lunch lunch = null;

    public Order (Drink d, Lunch l)
    {
        this.drink = d;
        this.lunch = l;
    }

    public Order(Drink d)
    {
        this.drink = d;
    }

    public Order(Lunch l)
    {
        this.lunch = l;
    }

    public double getBill()
    {
        if(drink == null)
            return lunch.getPrice();
        else if(lunch == null)
            return drink.getPrice();
        else
            return lunch.getPrice() + drink.getPrice();
    }

    public String getInfo()
    {
        if(drink == null)
            return "You ordered: \n" + lunch.getName();
        else if(lunch == null)
            return "You ordered: \n" + drink.getName();
        else
            return "You ordered: \n" + drink.getName() + "\n" + lunch.getName();
    }

}
