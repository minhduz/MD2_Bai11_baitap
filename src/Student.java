import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class Student implements Comparable<Student> {
    private String studentName;
    private Boolean studentSex;
    private Date studentBirthDate;

    public Student() {
    }

    public Student(String studentName, Boolean studentSex, Date studentBirthDate) {
        this.studentName = studentName;
        this.studentSex = studentSex;
        this.studentBirthDate = studentBirthDate;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Boolean getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(Boolean studentSex) {
        this.studentSex = studentSex;
    }

    public Date getStudentBirthDate() {
        return studentBirthDate;
    }

    public void setStudentBirthDate(Date studentBirthDate) {
        this.studentBirthDate = studentBirthDate;
    }

    @Override
    public String toString() {
        return "Tên: "+getStudentName()+" - Giới tính: "+getStudentSex()+" - Ngày sinh: "+getStudentBirthDate();
    }



    @Override
    public int compareTo(Student o) {
        return getStudentBirthDate().compareTo(o.getStudentBirthDate());
    }
}
