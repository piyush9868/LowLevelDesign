package creational.singleton;

import creational.singleton.config.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration config = Configuration.getInstance();
        System.out.println(config.getData());
    }
}
