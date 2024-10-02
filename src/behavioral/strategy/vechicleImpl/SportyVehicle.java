package behavioral.strategy.vechicleImpl;

import behavioral.strategy.DriveStrategy;
import behavioral.strategy.Vehicle;

public class SportyVehicle extends Vehicle {

    public SportyVehicle(DriveStrategy driveStrategy) {
        super.driveStrategy = driveStrategy;
    }

    @Override
    public void drive() {
        System.out.println("We are in sporty vehicle!!!!");
        driveStrategy.startDriving();
    }
}
