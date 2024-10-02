package structural.Decorator.toppingsDecoImpl;

import structural.Decorator.Pizza;
import structural.Decorator.ToppingsDecorator;

public class Jalapeno extends ToppingsDecorator {

    public Jalapeno(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 20;
    }
}
