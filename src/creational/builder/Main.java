package creational.builder;

public class Main {
    public static void main(String[] args) {

        //method chaining
        //thread unsafe
        Product2 product2 = Product2.getInstance("p12").setName("Lipstick");
        System.out.println(product2);

        //creational.builder
        //thread-safe
        Product prod = Product.builder("p13").setName("Pen").setColor("blue").build();
    }
}
