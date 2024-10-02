package designs.DatabaseProxy;

public class StudentDAOProxy{
    StudentDAO studentDAO;
    StudentDAOProxy(){
        studentDAO = new StudentDAOImpl();
    }

    public void getStudent(String userType, int studId) throws Exception {
        if(userType.equals("ADMIN") || userType.equals("USER")){
            studentDAO.get(studId);
        }
        else{
            throw new Exception("ACCESS DENIED FOR GET");
        }
    }

    public void createStudent(String userType, Student student) throws Exception {
        if(userType.equals("ADMIN")){
            studentDAO.create(student);
        }
        else{
            throw new Exception("ACCESS DENIED FOR CREATE");
        }
    }

    public void deleteStudent(String userType, int studId) throws Exception {
        if(userType.equals("ADMIN")){
            studentDAO.delete(studId);
        }
        else{
            throw new Exception("ACCESS DENIED FOR DELETE");
        }
    }
}
