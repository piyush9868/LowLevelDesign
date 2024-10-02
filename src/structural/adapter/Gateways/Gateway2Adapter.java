package structural.adapter.Gateways;

import structural.adapter.PaymentGateway;

public class Gateway2Adapter implements PaymentGateway {

    private Gateway2 gateway2;

    public Gateway2Adapter(Gateway2 gateway2) {
        this.gateway2 = gateway2;
    }

    @Override
    public void processPayment(double amount) {
        gateway2.charge(amount);
    }
}
