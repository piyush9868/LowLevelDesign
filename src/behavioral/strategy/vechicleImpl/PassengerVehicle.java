package behavioral.strategy.vechicleImpl;

import behavioral.strategy.DriveStrategy;
import behavioral.strategy.Vehicle;

public class PassengerVehicle extends Vehicle
{
    public PassengerVehicle(DriveStrategy driveStrategy) {
        super.driveStrategy = driveStrategy;
    }

    @Override
    public void drive() {
        System.out.println("We are in passenger vehicle vehicle!!!!");
        driveStrategy.startDriving();
    }
}
