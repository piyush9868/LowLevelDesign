package structural.adapter;

import structural.adapter.Gateways.Gateway1;
import structural.adapter.Gateways.Gateway2;
import structural.adapter.Gateways.Gateway2Adapter;

public class Main {
    public static void main(String[] args) {
        PaymentGateway p1 = new Gateway1();
        PaymentGateway p2 = new Gateway2Adapter(new Gateway2());

        p1.processPayment(10000);
        p2.processPayment(20000);
    }
}
