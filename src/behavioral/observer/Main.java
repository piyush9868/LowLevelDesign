package behavioral.observer;

import behavioral.observer.impl.EmailOTPObserver;
import behavioral.observer.impl.PhoneOTPObserver;
import behavioral.observer.user.User;

public class Main {
    public static void main(String[] args) {
        OTPTriggerObservable observable = new OTPTriggerObservable();
        User user = new User("Piyush", 7678329693L, "piyush.9868@gmail.com");

        OTPObserver emailObserver = new EmailOTPObserver(user);
        OTPObserver phoneObserver = new PhoneOTPObserver(user);
        observable.addObservers(emailObserver);
        observable.addObservers(phoneObserver);

        observable.notifyObservers();
    }
}
