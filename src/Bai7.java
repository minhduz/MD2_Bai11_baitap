import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.Queue;

public class Bai7 {
    public static void main(String[] args) throws ParseException {

        Student s1 = new Student("Nguyễn Văn A",true,getDate("2003-02-01"));
        Student s2 = new Student("Nguyễn Văn B",false,getDate("2006-06-13"));
        Student s3 = new Student("Nguyễn Văn C",true,getDate("2000-10-23"));
        Student s4 = new Student("Nguyễn Văn D",true,getDate("2001-12-01"));
        Student s5 = new Student("Nguyễn Văn E",false,getDate("2002-9-15"));

        Queue<Student> myQueue = new PriorityQueue<>();
        myQueue.offer(s1);
        myQueue.offer(s2);
        myQueue.offer(s3);
        myQueue.offer(s4);
        myQueue.offer(s5);

        for (Student st : myQueue) {
            System.out.printf("%s\n",st);
        }
    }

    public static Date getDate(String stringDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.parse(stringDate);
    }
}
