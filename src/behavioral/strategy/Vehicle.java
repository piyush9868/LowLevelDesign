package behavioral.strategy;

public abstract class Vehicle {

    protected DriveStrategy driveStrategy;

    public abstract void drive();
}
