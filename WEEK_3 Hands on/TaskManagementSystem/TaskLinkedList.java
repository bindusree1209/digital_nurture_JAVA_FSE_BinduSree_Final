public class TaskLinkedList {

    private TaskNode head;

    // Add Task
    public void addTask(Task task) {

        TaskNode newNode = new TaskNode(task);

        if (head == null) {
            head = newNode;
        } else {

            TaskNode temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        System.out.println("Task Added Successfully.");
    }

    // Search Task
    public void searchTask(int taskId) {

        TaskNode temp = head;

        while (temp != null) {

            if (temp.task.getTaskId() == taskId) {
                System.out.println("Task Found:");
                System.out.println(temp.task);
                return;
            }

            temp = temp.next;
        }

        System.out.println("Task Not Found.");
    }

    // Traverse Tasks
    public void traverseTasks() {

        if (head == null) {
            System.out.println("No Tasks Available.");
            return;
        }

        System.out.println("\nTask List:");

        TaskNode temp = head;

        while (temp != null) {
            System.out.println(temp.task);
            temp = temp.next;
        }
    }

    // Delete Task
    public void deleteTask(int taskId) {

        if (head == null) {
            System.out.println("Task List is Empty.");
            return;
        }

        if (head.task.getTaskId() == taskId) {
            head = head.next;
            System.out.println("Task Deleted Successfully.");
            return;
        }

        TaskNode temp = head;

        while (temp.next != null &&
               temp.next.task.getTaskId() != taskId) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Task Not Found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Task Deleted Successfully.");
        }
    }
}