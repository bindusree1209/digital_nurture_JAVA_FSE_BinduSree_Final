public class MVCPatternTest {

    public static void main(String[] args) {

        // Create Model
        Student student = new Student("BinduSree", "101", "A");

        // Create View
        StudentView view = new StudentView();

        // Create Controller
        StudentController controller = new StudentController(student, view);

        System.out.println("Initial Student Details:");
        controller.updateView();

        // Update Student Details
        controller.setStudentName("Kokkila BinduSree");
        controller.setStudentId("102");
        controller.setStudentGrade("A+");

        System.out.println("Updated Student Details:");
        controller.updateView();
    }
}