package creational.builder;

public class Product {
    //mandatory field
    private final String prodId;

    //optional
    private final String name;
    private final String color;
    private final int price;

    private Product(Builder builder) {
        this.prodId = builder.prodId;
        this.name = builder.name;
        this.color = builder.color;
        this.price = builder.price;
    }

    public static Builder builder(String prodId){
        return new Builder(prodId);
    }

    public static class Builder{
        private final String prodId;

        //optional
        private String name;
        private String color;
        private int price;

        private Builder(String prodId){
            this.prodId = prodId;
        }

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setColor(String color){
            this.color = color;
            return this;
        }


        public Builder setPrice(int price){
            this.price = price;
            return this;
        }
        public Product build(){
            return new Product(this);
        }

    }
}
