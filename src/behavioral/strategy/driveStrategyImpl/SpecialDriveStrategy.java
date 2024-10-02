package behavioral.strategy.driveStrategyImpl;

import behavioral.strategy.DriveStrategy;

public class SpecialDriveStrategy implements DriveStrategy {

    static SpecialDriveStrategy specialDriveStrategy;

    public static SpecialDriveStrategy getInstance(){
        if(specialDriveStrategy == null){
            specialDriveStrategy = new SpecialDriveStrategy();
        }
        return specialDriveStrategy;
    }

    private SpecialDriveStrategy() {
    }

    @Override
    public void startDriving() {
        System.out.println("Driving using special driving strategy");
    }
}
