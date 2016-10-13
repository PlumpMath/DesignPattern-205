package J2EEPatterns.MVCPattern;

/**
 * Created by Administrator on 2016/10/13.
 */
public class StudentView {
    public void printStudentDetail(String studentName, String studentRollNo) {
        System.out.println("Student:");
        System.out.println("name:" + studentName);
        System.out.println("rollNo:" + studentRollNo);
    }
}
