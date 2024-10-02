package structural.Decorator.basePizzaImpl;

import structural.Decorator.Pizza;

public class Farmhouse implements Pizza {
    @Override
    public int cost() {
        return 200;
    }
}
