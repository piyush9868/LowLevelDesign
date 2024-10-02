package creational.builder;

public class Product2 {
    //mandatory field
    private final String prodId;

    //optional
    private String name;
    private String color;
    private int price;

    private Product2(String prodId) {
        this.prodId = prodId;
    }

    public static Product2 getInstance(String prodId){
        return new Product2(prodId);
    }

    public Product2 setName(String name) {
        this.name = name;
        return this;
    }

    public Product2 setColor(String color) {
        this.color = color;
        return this;
    }

    public Product2 setPrice(int price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return "Product2{" +
                "prodId='" + prodId + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
