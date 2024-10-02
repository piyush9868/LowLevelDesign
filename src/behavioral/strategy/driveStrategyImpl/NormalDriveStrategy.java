package behavioral.strategy.driveStrategyImpl;

import behavioral.strategy.DriveStrategy;

//singleton class
public class NormalDriveStrategy implements DriveStrategy {

    static NormalDriveStrategy normalDriveStrategy;
    public static NormalDriveStrategy getInstance(){
        if(normalDriveStrategy == null){
            normalDriveStrategy = new NormalDriveStrategy();
        }
        return new NormalDriveStrategy();
    }

    private NormalDriveStrategy(){

    }

    @Override
    public void startDriving() {
        System.out.println("Driving using normal driving strategy");
    }
}
