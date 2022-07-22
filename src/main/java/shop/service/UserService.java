package shop.service;

import shop.model.Product;
import shop.model.User;
import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void displayUsersAll();

     User getUserById(Long id);
     List<Product> getOrdersByUserId(Long id);
    List<User> getUsersByProductId(Long id);


}