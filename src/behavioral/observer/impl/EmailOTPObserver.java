package behavioral.observer.impl;
import behavioral.observer.OTPObserver;
import behavioral.observer.user.User;

public class EmailOTPObserver implements OTPObserver {

    User user;

    public EmailOTPObserver(User user) {
        this.user = user;
    }

    @Override
    public void sendOTP() {
        System.out.println("Sending OTP to email address " + user.getEmail() + " .....");
    }
}
