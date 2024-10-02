package creational.factory.CarImpl;

import creational.factory.Car;

public class HatchBackCar implements Car {
    @Override
    public void drive() {
        System.out.println("Driving a HatchBack car");
    }
}
