package designs.DatabaseProxy;

public class Client {
    public static void main(String[] args) {
        try {
            //we can also make proxy implement interface, that way we can get a single DAO instance.
            StudentDAOProxy proxy = new StudentDAOProxy();
            proxy.getStudent("MANAGER", 1);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
