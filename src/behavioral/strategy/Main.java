package behavioral.strategy;

import behavioral.strategy.driveStrategyImpl.NormalDriveStrategy;
import behavioral.strategy.driveStrategyImpl.SpecialDriveStrategy;
import behavioral.strategy.vechicleImpl.PassengerVehicle;
import behavioral.strategy.vechicleImpl.SportyVehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new SportyVehicle(SpecialDriveStrategy.getInstance());
        Vehicle v2 = new PassengerVehicle(NormalDriveStrategy.getInstance());
        Vehicle v3 = new SportyVehicle(SpecialDriveStrategy.getInstance());

        v1.drive();
        v2.drive();
        v3.drive();
    }
}
