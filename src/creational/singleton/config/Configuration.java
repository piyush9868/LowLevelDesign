package creational.singleton.config;

import java.io.InputStream;

//creational.singleton class
public class Configuration {
    private static Configuration config;
    private String prop1, prop2, prop3;

    private Configuration(){
        setProps();
    }

    private void setProps() {
        try(InputStream input = getClass().getResourceAsStream("/")){

        }
        catch (Exception e){
            e.printStackTrace();
        }
        prop1 = "1";
        prop2 = "2";
        prop3 = "3";
    }

    //loader
    public static Configuration getInstance(){
        if(config == null){
            config = new Configuration();
        }
        return config;
    }
    public String getData() {
        return "{prop1='" + prop1 + '\'' +
                ", prop2='" + prop2 + '\'' +
                ", prop3='" + prop3 + '\'' +
                '}';
    }
}
