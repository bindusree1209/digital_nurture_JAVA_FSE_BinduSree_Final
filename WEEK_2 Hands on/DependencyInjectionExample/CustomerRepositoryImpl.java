public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {

        if (id == 101) {
            return "Customer ID: 101\nName: BinduSree";
        } else if (id == 102) {
            return "Customer ID: 102\nName: Rahul";
        } else {
            return "Customer not found.";
        }
    }
}