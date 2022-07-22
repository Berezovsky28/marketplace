package shop.db;

import shop.model.Product;
import shop.model.User;
import java.util.Arrays;
import java.util.List;

public class DataGenerator {
    public List<User> generateUsers() {
        User people1 = new User(11111L, "Patrik", "Blake", 1000.00);
        User people2 = new User(22222L, "Sem", "Watson", 1500.00);
        User people3 = new User(33333L, "Bob", "Atkins", 2000.00);
        return Arrays.asList(people1, people2, people3);
    }

    public List<Product>  generateProducts() {
        Product item1 = new Product(44444L, "Bread", 15.00);
        Product item2 = new Product(55555L, "Milk", 50.00);
        Product item3 = new Product(66666L, "Ace cream", 30.00);
        return Arrays.asList(item1, item2, item3);
    }
}
