public class OrderTest {

    public static void display(Order[] orders) {

        for (Order order : orders) {
            System.out.println(order);
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Order[] orders = {
                new Order(101, "Rahul", 4500),
                new Order(102, "Priya", 1200),
                new Order(103, "Kiran", 8900),
                new Order(104, "Anjali", 3000),
                new Order(105, "Ravi", 6500)
        };

        System.out.println("Original Orders");
        display(orders);

        BubbleSort.bubbleSort(orders);

        System.out.println("After Bubble Sort");
        display(orders);

        Order[] orders2 = {
                new Order(101, "Rahul", 4500),
                new Order(102, "Priya", 1200),
                new Order(103, "Kiran", 8900),
                new Order(104, "Anjali", 3000),
                new Order(105, "Ravi", 6500)
        };

        QuickSort.quickSort(orders2, 0, orders2.length - 1);

        System.out.println("After Quick Sort");
        display(orders2);
    }
}