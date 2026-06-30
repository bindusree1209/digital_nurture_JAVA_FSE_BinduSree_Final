public class TaskTest {

    public static void main(String[] args) {

        TaskLinkedList list = new TaskLinkedList();

        list.addTask(new Task(101, "Design Database", "Pending"));
        list.addTask(new Task(102, "Develop Backend", "In Progress"));
        list.addTask(new Task(103, "Testing", "Pending"));

        list.traverseTasks();

        System.out.println();

        list.searchTask(102);

        System.out.println();

        list.deleteTask(101);

        System.out.println();

        list.traverseTasks();
    }
}