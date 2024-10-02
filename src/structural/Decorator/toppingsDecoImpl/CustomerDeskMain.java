package structural.Decorator.toppingsDecoImpl;

import structural.Decorator.Pizza;
import structural.Decorator.basePizzaImpl.Farmhouse;

public class CustomerDeskMain {
    public static void main(String[] args) {
        //lets say customer ordered a farmhouse pizza with mushrooms and extra cheese
        Pizza pizza = new Mushrooms(new ExtraCheese(new Farmhouse()));
        System.out.println(pizza.cost());
    }
}
