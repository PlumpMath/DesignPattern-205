package J2EEPatterns.MVCPattern;

import BehavioralPatterns.ObserverPattern.Subject;

/**
 MVC 模式
     MVC 模式代表 Model-View-Controller（模型-视图-控制器） 模式。这种模式用于应用程序的分层开发。
         Model（模型） - 模型代表一个存取数据的对象或 JAVA POJO。它也可以带有逻辑，在数据变化时更新控制器。
         View（视图） - 视图代表模型包含的数据的可视化。
         Controller（控制器） - 控制器作用于模型和视图上。它控制数据流向模型对象，并在数据变化时更新视图。它使视图与模型分离开。
 */
public class Main {
    public static void main(String[] args) {

        //从数据库湖区学生记录
        Student student = Main.retriveStudentFromDatabase();

        //创建视图:把学生详细信息输出到控制台
        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(student, studentView);
        studentController.updateView();

        //更新模型数据
        studentController.setStudentName("John");
        studentController.updateView();

    }

    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Rober");
        student.setRollNo("10");
        return student;
    }
}
