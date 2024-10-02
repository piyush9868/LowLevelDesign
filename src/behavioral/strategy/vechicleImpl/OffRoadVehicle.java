package behavioral.strategy.vechicleImpl;

import behavioral.strategy.DriveStrategy;
import behavioral.strategy.Vehicle;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle(DriveStrategy driveStrategy) {
        super.driveStrategy = driveStrategy;
    }

    @Override
    public void drive() {
        System.out.println("We are in off-road vehicle vehicle!!!!");
        driveStrategy.startDriving();
    }
}
