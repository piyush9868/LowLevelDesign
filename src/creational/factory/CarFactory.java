package creational.factory;

import creational.factory.CarImpl.HatchBackCar;
import creational.factory.CarImpl.SUVCar;
import creational.factory.CarImpl.SedanCar;

public class CarFactory {

    public static Car getCar(String carInput){
        return switch (carInput) {
            case "SEDAN" -> new SedanCar();
            case "SUV" -> new SUVCar();
            case "HATCHBACK" -> new HatchBackCar();
            default -> null;
        };
    }
}
