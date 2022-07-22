package shop.service.impl;

import shop.db.Storage;
import shop.model.Order;
import shop.model.Product;
import shop.model.User;
import shop.service.UserService;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public List<User> getAllUsers() {
        return Storage.users;
    }

    @Override
    public void displayUsersAll() {
        System.out.println(getAllUsers());
    }

    @Override
    public User getUserById(Long id) {
        for (User user : Storage.users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<Product> getOrdersByUserId(Long id) {
        List<Product> result = new ArrayList<>();
        for (Order order : Storage.orders) {
            if(order.getUser().getId() == id ){
                result.add(order.getProduct());
            }
        }
        return result;
    }

    @Override
    public List<User> getUsersByProductId(Long id) {
        List<User> result = new ArrayList<>();
        for (Order order : Storage.orders) {
            if(order.getProduct().getId() == id ){
                result.add(order.getUser());
            }
        }
        return result ;
    }

}
