package creational.factory;

public class Main {
    public static void main(String[] args) {
        Car c1 = CarFactory.getCar("SEDAN");
        Car c2 = CarFactory.getCar("SUV");
        Car c3 = CarFactory.getCar("HATCHBACK");

        c1.drive();
        c2.drive();
        c3.drive();
    }
}
