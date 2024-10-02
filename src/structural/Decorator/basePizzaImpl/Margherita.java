package structural.Decorator.basePizzaImpl;

import structural.Decorator.Pizza;

public class Margherita implements Pizza {
    @Override
    public int cost() {
        return 100;
    }
}
