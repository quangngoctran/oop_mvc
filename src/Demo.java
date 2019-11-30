/*
 *  This code is taken from https://www.tutorialspoint.com/design_pattern/mvc_pattern.htm
 */

public class Demo {
    public static void main(String[] args) {
        // Create model, view, and controller objects
        Student model = retrieveStudentFromDatastore();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        // Show the view
        controller.updateView();

        // Correct student name then show the view again
        controller.setStudentName("Nguyen Van Chinh");
        controller.updateView();
    }

    private static Student retrieveStudentFromDatastore() {
        Student student = new Student("1234567", "Nguyen Van Minh");
        return student;
    }
}
