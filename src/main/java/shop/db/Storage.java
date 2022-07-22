package shop.db;

import shop.model.Order;
import shop.model.Product;
import shop.model.User;
import java.util.ArrayList;
import java.util.List;

public class Storage {
    public static List<User> users = new ArrayList<>();
    public static List<Product> products = new ArrayList<>();
    public static List<Order> orders = new ArrayList<>();
}
