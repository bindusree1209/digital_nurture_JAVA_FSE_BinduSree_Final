public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeManager manager = new EmployeeManager(10);

        manager.addEmployee(new Employee(101, "Rahul", "Manager", 70000));
        manager.addEmployee(new Employee(102, "Priya", "Developer", 55000));
        manager.addEmployee(new Employee(103, "Anjali", "Tester", 45000));

        manager.traverseEmployees();

        System.out.println();

        manager.searchEmployee(102);

        System.out.println();

        manager.deleteEmployee(103);

        manager.traverseEmployees();
    }
}