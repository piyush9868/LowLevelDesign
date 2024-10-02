package structural.Decorator.basePizzaImpl;

import structural.Decorator.Pizza;

public class VeggieDelight implements Pizza {
    @Override
    public int cost() {
        return 150;
    }
}
