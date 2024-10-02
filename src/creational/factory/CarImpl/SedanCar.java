package creational.factory.CarImpl;

import creational.factory.Car;

public class SedanCar implements Car {
    @Override
    public void drive() {
        System.out.println("Driving a Sedan car");
    }
}
