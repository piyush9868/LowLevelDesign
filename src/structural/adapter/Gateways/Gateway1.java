package structural.adapter.Gateways;

import structural.adapter.PaymentGateway;

public class Gateway1 implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment with gateway1 of amount = $" + amount);
    }
}
