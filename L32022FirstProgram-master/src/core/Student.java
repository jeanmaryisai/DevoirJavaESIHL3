package core;

public class Student extends Human{
    private int studentID;

    public Student(String lname, String fname) {
        super(lname, fname);
    }

    public Student() {
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
