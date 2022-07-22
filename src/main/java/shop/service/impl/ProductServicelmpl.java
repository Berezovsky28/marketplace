package shop.service.impl;

import shop.service.ProductService;

import shop.db.Storage;
import shop.exception.OrderException;
import shop.model.Order;
import shop.model.Product;
import shop.model.User;
import java.util.List;

public class ProductServicelmpl implements ProductService {

    private UserServiceImpl userService = new UserServiceImpl();
    @Override
    public List<Product> getAllProducts() {
        return Storage.products;
    }

    @Override
    public void displayProductAll() {
        System.out.println(getAllProducts());
    }

    @Override
    public void buy(Long userID, Product product) throws OrderException {
        User user = userService.getUserById(userID);
        if (user.getAmountOfMoney()>= product.getPrice()){
            Storage.orders.add(new Order(user, product));
            user.setAmountOfMoney(user.getAmountOfMoney()-product.getPrice());
            System.out.println(user.getFirstname() + " successful purchase "+ " "+ product.getName());
        } else throw new OrderException("Not enough money!");

    }
}
