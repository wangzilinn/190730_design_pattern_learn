package MVC;

public class MVCPatternDemo {
    public static void main(String[] args) {
        //get data from db
        Student model = retrieveStudentFromDataBase();
        //create a view, sent student detail to console
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        //update model data
        controller.setStudentName("wang");

        controller.updateView();
    }

    private static Student retrieveStudentFromDataBase() {
        Student student = new Student();
        student.setRollNo("10");
        student.setName("Huang");
        return student;
    }
}
