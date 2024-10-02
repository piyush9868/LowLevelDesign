package structural.Decorator.toppingsDecoImpl;

import structural.Decorator.Pizza;
import structural.Decorator.ToppingsDecorator;

public class Mushrooms extends ToppingsDecorator {

    public Mushrooms(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 15;
    }
}
