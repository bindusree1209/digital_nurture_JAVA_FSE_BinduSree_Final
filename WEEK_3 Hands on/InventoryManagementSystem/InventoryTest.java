public class InventoryTest {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        // Add Products
        inventory.addProduct(new Product(101, "Laptop", 15, 65000));
        inventory.addProduct(new Product(102, "Mouse", 50, 700));
        inventory.addProduct(new Product(103, "Keyboard", 30, 1500));

        // Display Products
        inventory.displayProducts();

        // Update Product
        inventory.updateProduct(102, "Wireless Mouse", 45, 1200);

        // Delete Product
        inventory.deleteProduct(103);

        // Display Again
        inventory.displayProducts();
    }
}