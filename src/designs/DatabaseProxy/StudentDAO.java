package designs.DatabaseProxy;

public interface StudentDAO {
    public void get(int studId);
    public void create(Student student);
    public void delete(int studId);
}
