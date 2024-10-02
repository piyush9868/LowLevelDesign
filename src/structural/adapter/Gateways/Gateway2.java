package structural.adapter.Gateways;

// we want this gateway to work with interface Payment gateway
// we create an adapter for gateway 2
public class Gateway2 {
    public void charge(double amount){
        System.out.println("Charging payment with gateway2: $" + amount);
    }
}
