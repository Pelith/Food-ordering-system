import Drink.*;
import Meal.*;
import Order.Order;
import Lunch.Lunch;
import java.util.Scanner;

/**
 * Created by Piotr Dorman on 2016-02-27.
 */
public class Restaurant {
    private Drink d;
    private Meal m;
    private Lunch l;
    private Order o;
    public Restaurant()
    {
        d = null;
        m = null;
        o = null;
        l = null;
    }
    private void orderDrink()
    {
        int i;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Select your option:\n1. Just drink\n2. Add ice cubes\n3. Add lemon\n4. Add lemon and ice cubes");
        i = keyboard.nextInt();
        switch(i)
        {
            case 1:
                d = new SimpleDrink();
                break;
            case 2:
                d = new SimpleDrink();
                d = new WithIceCubes(d);
                break;
            case 3:
                d = new SimpleDrink();
                d = new WithLemon(d);
                break;
            case 4:
                d = new SimpleDrink();
                d = new WithIceCubes(d);
                d = new WithLemon(d);
                break;
            default:
                System.out.println("Wrong option");
                break;
        }
    }
    private void orderFood()
    {
        int i;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Select meal\n1. Polish dish (Polish Cuisine)\n2. Mexican dish (Mexican Cuisine)\n3. Italian dish (Italian Cuisine)");
        i = keyboard.nextInt();
        switch(i)
        {
            case 1:
                m = new PolishDish();
                break;
            case 2:
                m = new MexicanDish();
                break;
            case 3:
                m = new ItalianDish();
                break;
            default:
                System.out.println("Wrong option");
                break;
        }
        Dessert dessert = new Dessert();
        l = new Lunch(dessert,m);
    }

    public void makeOrder()
    {
        int i,j;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello, what you want to order: \n" +
                "1. Drink \n2. Lunch");
        i = keyboard.nextInt();
        switch(i)
        {
            case 1:
                orderDrink();
                System.out.println("Maybe lunch too?\n1. Yes\n2. No thanks");
                j = keyboard.nextInt();
                if(j==1)
                    orderFood();
                break;
            case 2:
                orderFood();
                System.out.println("Maybe something to drink?\n1. Yes\n2. No thanks");
                j = keyboard.nextInt();
                if(j==1)
                    orderDrink();
                break;

            default:
                System.out.println("Wrong option");
                break;
        }
        o = new Order(d,l);
        System.out.println(o.getInfo());
    }
    public void bill()
    {
        System.out.println("To pay: " + o.getBill());
    }
}
