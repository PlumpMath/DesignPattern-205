package J2EEPatterns.MVCPattern;

/**
 * Created by Administrator on 2016/10/13.
 */
public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student student, StudentView studentView) {
        this.model = student;
        this.view = studentView;
    }

    public void setStudentName(String name) {
        this.model.setName(name);
    }

    public String getStudentName() {
        return this.model.getName();
    }

    public void setStudentRollNo(String rollNo) {
        this.model.setRollNo(rollNo);
    }

    public String getStudentRollNo() {
        return this.model.getRollNo();
    }

    public void updateView() {
        view.printStudentDetail(model.getName(),model.getRollNo());
    }



}
