public class LibraryTest {

    public static void main(String[] args) {

        Book[] books = {
                new Book(101, "Java Programming", "James"),
                new Book(102, "Python Basics", "Guido"),
                new Book(103, "Data Structures", "Mark"),
                new Book(104, "Operating Systems", "Silberschatz"),
                new Book(105, "Algorithms", "Thomas")
        };

        Book found = Library.linearSearch(books, "Algorithms");

        if (found != null)
            System.out.println("Linear Search Result:");
        System.out.println(found);

        found = Library.binarySearch(books, "Algorithms");

        if (found != null)
            System.out.println("\nBinary Search Result:");
        System.out.println(found);
    }
}