package designs.DatabaseProxy;

public class StudentDAOImpl implements StudentDAO{
    @Override
    public void get(int studId) {
        System.out.println("Getting data from DB...");
    }

    @Override
    public void create(Student student) {
        System.out.println("creating a new user...");
    }

    @Override
    public void delete(int studId) {
        System.out.println("deleting the user a new user...");
    }
}
