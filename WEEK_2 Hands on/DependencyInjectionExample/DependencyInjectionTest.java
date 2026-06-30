public class DependencyInjectionTest {

    public static void main(String[] args) {

        // Create Repository
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject Repository into Service
        CustomerService service = new CustomerService(repository);

        System.out.println("Finding Customer with ID 101:");
        service.displayCustomer(101);

        System.out.println();

        System.out.println("Finding Customer with ID 105:");
        service.displayCustomer(105);
    }
}