package creational.factory.CarImpl;

import creational.factory.Car;

public class SUVCar implements Car {
    @Override
    public void drive() {
        System.out.println("Driving an SUV car");
    }
}
