package behavioral.observer.impl;

import behavioral.observer.OTPObserver;
import behavioral.observer.user.User;

public class PhoneOTPObserver implements OTPObserver {
    User user;

    public PhoneOTPObserver(User user) {
        this.user = user;
    }


    @Override
    public void sendOTP() {
        System.out.println("Sending OTP to phone number " + user.getPhone() + " .....");
    }
}
