package structural.Decorator.toppingsDecoImpl;

import structural.Decorator.Pizza;
import structural.Decorator.ToppingsDecorator;

public class ExtraCheese extends ToppingsDecorator {

    public ExtraCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 30;
    }
}