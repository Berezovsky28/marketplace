package shop.service;

import shop.exception.OrderException;
import shop.model.Product;
import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    void displayProductAll();

    void buy(Long userI, Product product) throws OrderException;

}
