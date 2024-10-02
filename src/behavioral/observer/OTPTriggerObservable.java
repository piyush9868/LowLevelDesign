package behavioral.observer;

import behavioral.observer.user.User;

import java.util.ArrayList;
import java.util.List;

public class OTPTriggerObservable {
    List<OTPObserver> otpObservers;

    public OTPTriggerObservable() {
        otpObservers = new ArrayList<>();
    }

    public void addObservers(OTPObserver observer){
        otpObservers.add(observer);
    }

    public void removeObservers(OTPObserver observer){
        otpObservers.remove(observer);
    }

    public void notifyObservers(){
        otpObservers.forEach(OTPObserver::sendOTP);
    }
}
